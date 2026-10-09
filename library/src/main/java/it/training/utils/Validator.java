package it.training.utils;

import java.time.LocalDate;
import java.time.Month;

import it.training.ui.Messages;

public final class Validator {
    /**
     * Validate text not null or empty
     * 
     * @param text
     * @param fieldName
     * @return {@code text} trimmed
     * @throws IllegalArgumentException
     */
    public static String validateText(String text, String fieldName) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException(fieldName + " " + Messages.EMPTY_OR_NULL_TEXT);
        }
        return text.trim();
    }

    /**
     * Validate positive number
     * 
     * @param number
     * @param fieldName
     * @return {@code number}
     * @throws IllegalArgumentException
     */
    public static int validatePositiveNumber(int number, String fieldName) {
        if (number <= 0) {
            throw new IllegalArgumentException(fieldName + " " + Messages.POSITIVE_NUMBER_ERROR);
        }
        return number;
    }

    /**
     * Validate year not greater than current year
     * 
     * @param year
     * @param fieldName
     * @return {@code year}
     * @throws IllegalArgumentException
     */
    public static int validateYear(int year, String fieldName) {
        LocalDate localDate = LocalDate.now();
        int currentYear = localDate.getYear();

        if (year > currentYear) {
            throw new IllegalArgumentException(fieldName + " " + Messages.INVALID_YEAR_ERROR);
        }

        return year;
    }

    /**
     * Validate month name
     * 
     * @param monthToValidate
     * @return {@code month}
     * @throws IllegalArgumentException
     */
    public static Month validateMonth(String monthToValidate) {
        String validMonthString = validateText(monthToValidate, "Release month");

        try {
            return Month.valueOf(validMonthString.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(Messages.INVALID_MONTH_ERROR + " " + validMonthString);
        }
    }
}
