package it.training.ui;

public final class Messages {

    // application title
    public static final String APP_TITLE = "\n =====  LIBRARY  ==== \n";

    // exit message
    public static final String EXIT_MESSAGE = "Goodbye!\n";

    // LibraryElement prompts
    public static final String TITLE_PROMPT = "Enter title: ";
    public static final String YEAR_PROMPT = "Enter publishing year: ";
    public static final String UNIQUE_CODE_PROMPT = "Enter unique code: ";

    // Book prompts
    public static final String PAGE_COUNT_PROMPT = "Enter page count: ";
    public static final String AUTHOR_PROMPT = "Enter author: ";

    // Magazine prompts
    public static final String EDITION_NUMBER_PROMPT = "Enter edition number: ";
    public static final String MONTH_PROMPT = "Enter release month: ";

    // options
    public static final String OPTION_ADD = "[1] - Add Library Element";
    public static final String OPTION_REMOVE = "[2] - Remove Library Element";
    public static final String OPTION_SHOW_ALL = "[3] - Show all Library Elements";
    public static final String EXIT_OPTION = "[0] - Exit";
    public static final String OPTION_TYPE = "\n[1] - Book\n[2] - Magazine\n[0] - Cancel\nChoice a type: ";

    // seletection prompt
    public static final String SELECTION_PROMPT = "\nChoice an option: ";

    // errors
    public static final String WRONG_INPUT_ERROR = "Invalid input. Please try again.";
    public static final String EMPTY_OR_NULL_TEXT = "Cannot be null or empty";
    public static final String INVALID_MONTH_ERROR = "Invalid month name";
    public static final String INVALID_YEAR_ERROR = "Invalid year. Cannot be greater than current year";
    public static final String POSITIVE_NUMBER_ERROR = "Cannot be 0 or negative";
    public static final String NOT_FOUND_ERROR = "Element not found";
    public static final String INVALID_NUMBER_ERROR = "Invalid number";

    // conflict
    public static final String CONFLICT_ERROR = "An element with the same unique code already exists in the library.";

    // success messages
    public static final String ELEMENT_ADDED_SUCCESSFULLY = "Element added successfully!";
    public static final String ELEMENT_REMOVED_SUCCESSFULLY = "Element removed successfully!";

}
