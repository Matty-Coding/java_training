package it.training.models;

import java.time.Month;

import it.training.utils.Validator;

public class Magazine extends LibraryElement {
    private int editionNumber;
    private Month releaseMonth;

    public Magazine(String title, int publishingYear, String uniqueCode, int editionNumber, String releaseMonth) {
        super(title, publishingYear, uniqueCode);

        this.editionNumber = Validator.validatePositiveNumber(editionNumber, "Edition number");
        this.releaseMonth = Validator.validateMonth(releaseMonth);
    }

    @Override
    public String getFormattedDetails() {
        return super.getFormattedDetails() + "\nEdition number: " + this.editionNumber + "\nRelease month: "
                + this.releaseMonth;
    }

    // getters
    public int getEditionNumber() {
        return editionNumber;
    }

    public Month getReleaseMonth() {
        return releaseMonth;
    }

    // setters
    public void setEditionNumber(int editionNumber) {
        int validEditionNumber = Validator.validatePositiveNumber(editionNumber, "Edition number");
        this.editionNumber = validEditionNumber;
    }

    public void setReleaseMonth(String releaseMonth) {
        Month validReleaseMonth = Validator.validateMonth(releaseMonth);
        this.releaseMonth = validReleaseMonth;
    }
}
