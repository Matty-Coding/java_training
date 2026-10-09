package it.training;

import it.training.models.Book;
import it.training.models.Magazine;
import it.training.services.LibraryService;
import it.training.ui.Console;
import it.training.ui.Input;
import it.training.ui.LibraryCli;

public class App {
    public static void main(String[] args) {
        Input input = new Input();
        Console menu = new Console();
        LibraryService service = new LibraryService();

        // initial seed
        for (Book book : Data.BOOKS) {
            service.add(book);
        }

        for (Magazine magazine : Data.MAGAZINES) {
            service.add(magazine);
        }

        LibraryCli cli = new LibraryCli(input, menu, service);
        System.out.println(Runtime.version());
        cli.run();
    }
}
