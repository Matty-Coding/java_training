package it.training.ui;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import it.training.models.Book;
import it.training.models.LibraryElement;
import it.training.models.Magazine;
import it.training.services.LibraryService;
import it.training.utils.Validator;

public class LibraryCli {
    private final Input input;
    private final Console console;
    private final LibraryService service;
    private final Map<String, Runnable> actions;

    public LibraryCli(Input input, Console console, LibraryService service) {
        this.input = input;
        this.console = console;
        this.service = service;
        this.actions = Map.of(
                "1", this::addElement,
                "2", this::removeElement,
                "3", this::showAllElements);
    }

    /**
     * Show all the elements in the library
     * 
     * @see LibraryService#findAll()
     */
    private void showAllElements() {
        Collection<LibraryElement> elements = this.service.findAll();

        if (elements.isEmpty()) {
            this.console.showMessage("There are no elements in the library.");
            return;
        }

        for (LibraryElement element : elements) {
            this.console.showMessage(element.getFormattedDetails());
        }
    }

    /**
     * Ask the user for the element type
     * 
     * @return {@link Optional} of {@link ElementType}
     */
    private Optional<ElementType> askElementType() {
        while (true) {
            String choice = this.input.getString(Messages.OPTION_TYPE).trim();

            switch (choice) {
                case "1":
                    return Optional.of(ElementType.BOOK);

                case "2":
                    return Optional.of(ElementType.MAGAZINE);

                case "0":
                    return Optional.empty();

                default:
                    this.console.showError(Messages.WRONG_INPUT_ERROR);
            }
        }
    }

    /**
     * Add a new element to the library
     */
    private void addElement() {
        Optional<ElementType> type = askElementType();

        if (type.isEmpty()) {
            return;
        }

        String title = Validator.validateText(this.input.getString(Messages.TITLE_PROMPT), "Title");
        String uniqueCode = Validator.validateText(this.input.getString(Messages.UNIQUE_CODE_PROMPT), "Unique code");
        int publishingYear = Validator.validateYear(this.input.getInt(Messages.YEAR_PROMPT), "Publishing year");

        // switch as value generated with callback + yield
        LibraryElement element = null;
        switch (type.get()) {
            case BOOK: {
                int pageCount = Validator.validatePositiveNumber(this.input.getInt(Messages.PAGE_COUNT_PROMPT),
                        "Page count");
                String author = Validator.validateText(this.input.getString(Messages.AUTHOR_PROMPT), "Author");
                element = new Book(title, publishingYear, uniqueCode, pageCount, author);
                break;
            }

            case MAGAZINE: {
                int edition = Validator.validatePositiveNumber(this.input.getInt(Messages.EDITION_NUMBER_PROMPT),
                        "Edition number");
                String month = Validator.validateMonth(this.input.getString(Messages.MONTH_PROMPT)).toString();
                element = new Magazine(title, publishingYear, uniqueCode, edition, month);
                break;
            }
        }

        if (this.service.add(element)) {
            this.console.showMessage(Messages.ELEMENT_ADDED_SUCCESSFULLY);

        } else {
            this.console.showError(Messages.CONFLICT_ERROR);
        }
    }

    /**
     * Remove an element from the library
     */
    private void removeElement() {
        String uniqueCode = this.input.getString(Messages.UNIQUE_CODE_PROMPT);

        if (this.service.remove(uniqueCode)) {
            this.console.showMessage(Messages.ELEMENT_REMOVED_SUCCESSFULLY);

        } else {
            this.console.showError(Messages.NOT_FOUND_ERROR);
        }
    }

    /**
     * Run the application
     */
    public void run() {
        try {
            while (true) {
                this.console.showMenu();

                String userInput = this.input.getString(Messages.SELECTION_PROMPT);

                if (userInput.equals("0")) {
                    this.console.showExitMessage();
                    break;
                }

                // if the action is not found, show an error with a callback
                Runnable action = this.actions.getOrDefault(userInput,
                        () -> this.console.showError(Messages.WRONG_INPUT_ERROR));

                try {
                    action.run();

                } catch (Exception e) {
                    // show the custom validator exception message
                    this.console.showError(e.getMessage());
                }
            }
        } finally {
            // ensure that the scanner is closed
            this.input.close();
        }
    }
}
