package it.training.models;

import it.training.utils.Validator;

// abstract to ensure that this class cannot be instantiated
// implements Writable interface to let subclasses implement the interface methods
public abstract class LibraryElement implements Writable {

    // common attributes
    private String title;
    private int publishingYear;
    private String uniqueCode;

    /**
     * Library element constructor
     * 
     * @param title
     * @param publishingYear
     * @param uniqueCode
     * @throws IllegalArgumentException
     */
    public LibraryElement(String title, int publishingYear, String uniqueCode) {
        this.title = Validator.validateText(title, "Title");
        this.publishingYear = Validator.validateYear(publishingYear, "Publishing year");
        this.uniqueCode = Validator.validateText(uniqueCode, "Unique code");
    }

    @Override
    public String getFormattedDetails() {
        return "\nTitle: " + this.title + "\nPublishing year: " + this.publishingYear + "\nUnique code: "
                + this.uniqueCode;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    // setters
    public void setTitle(String title) {
        String validTitle = Validator.validateText(title, "Title");
        this.title = validTitle;
    }

    public void setPublishingYear(int publishingYear) {
        int validYear = Validator.validateYear(publishingYear, "Publishing year");
        this.publishingYear = validYear;
    }
}
