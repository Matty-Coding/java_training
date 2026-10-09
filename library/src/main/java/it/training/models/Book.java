package it.training.models;

import it.training.utils.Validator;

public class Book extends LibraryElement {
    private int pageCount;
    private String author;

    public Book(String title, int publishingYear, String uniqueCode, int pageCount, String author) {
        super(title, publishingYear, uniqueCode);

        this.pageCount = Validator.validatePositiveNumber(pageCount, "Page count");
        this.author = Validator.validateText(author, "Author");
    }

    @Override
    public String getFormattedDetails() {
        return super.getFormattedDetails() + "\nPage count: " + this.pageCount + "\nAuthor: " + this.author;
    }

    // getters
    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    // setters
    public void setPageCount(int pageCount) {
        int validPageCount = Validator.validatePositiveNumber(pageCount, "Page count");
        this.pageCount = validPageCount;
    }

    public void setAuthor(String author) {
        String validAuthor = Validator.validateText(author, "Author");
        this.author = validAuthor;
    }
}
