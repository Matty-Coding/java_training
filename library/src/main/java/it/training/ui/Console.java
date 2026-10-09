package it.training.ui;

public class Console {
    public void showMenu() {
        System.out.println(Messages.APP_TITLE);
        System.out.println(Messages.OPTION_ADD);
        System.out.println(Messages.OPTION_REMOVE);
        System.out.println(Messages.OPTION_SHOW_ALL);
        System.out.println(Messages.EXIT_OPTION);
    }

    public void showExitMessage() {
        System.out.println(Messages.EXIT_MESSAGE);
    }

    public void showError(String message) {
        System.err.println("Error: " + message);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
