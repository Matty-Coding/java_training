package it.training.app;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public double getDouble(String prompt) {
        while (true) {
            try {
                String input = getString(prompt);
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public int getInt(String prompt) {
        while (true) {
            try {
                String input = getString(prompt);
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public void close() {
        scanner.close();
    }
}
