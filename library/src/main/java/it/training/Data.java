package it.training;

import it.training.models.Book;
import it.training.models.Magazine;

public final class Data {
        public static final String[] MONTHS = { "January", "February", "March", "April", "May", "June", "July",
                        "August",
                        "September", "October", "November", "December" };

        public static final Book[] BOOKS = new Book[] {
                        new Book("Book 1", 2021, "001", 200, "Author 1"),
                        new Book("Book 2", 2022, "002", 300, "Author 2"),
                        new Book("Book 3", 2023, "003", 400, "Author 3")
        };

        public static final Magazine[] MAGAZINES = new Magazine[] {
                        new Magazine("Magazine 1", 2021, "004", 1, "January"),
                        new Magazine("Magazine 2", 2022, "005", 2, "February"),
                        new Magazine("Magazine 3", 2023, "006", 3, "March")
        };

        // Wrong data
        // public static final Book WRONG_TITLE_BOOK = new Book("", 2021, "001", 200,
        // "Author 1");

        // public static final Book WRONG_YEAR_BOOK = new Book("Book 1", 2028, "001",
        // 200, "Author 1");

        // public static final Book WRONG_PAGE_COUNT_BOOK = new Book("Book 1", 2025,
        // "001", 0, "Author 1");

        // public static final Magazine WRONG_MONTH_MAGAZINE = new Magazine("Magazine
        // 1", 2021, "004", 1, "Julyy");
}
