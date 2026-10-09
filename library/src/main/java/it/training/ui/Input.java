package it.training.ui;

import java.util.Scanner;

public final class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    /**
     * Reads an integer from the user
     * 
     * @param prompt
     * @return {@code int}
     * @throws NumberFormatException
     */
    public int getInt(String prompt) {
        while (true) {
            try {
                String userInput = getString(prompt);
                return Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                throw new NumberFormatException(Messages.INVALID_NUMBER_ERROR);
            }
        }
    }

    public void close() {
        scanner.close();
    }
}
