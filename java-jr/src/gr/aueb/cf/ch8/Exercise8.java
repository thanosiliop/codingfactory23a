package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Prints a menu, takes a choice from the user
 * and prints a feedback message, handling all the
 * exceptions that arise.
 */
public class Exercise8 {

    public static void main(String[] args) {
        printMenu();
        int choice = getChoice();

        if (choice == 5) System.out.println("You chose to exit.");

        while (choice != 5) {
            try {
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Please choose a valid option.\n");
            }
            printMenu();
            choice = getChoice();
        }
    }

    /**
     * Prints the menu
     */
    public static void printMenu() {
        System.out.println("Please choose an option between 1 and 4 and 5 to exit.");
        System.out.println("Option 1.");
        System.out.println("Option 2.");
        System.out.println("Option 3.");
        System.out.println("Option 4.");
        System.out.println("Option 5 to Exit.");
    }

    /**
     * Prompts the user to enter his choice
     * @return      -1 if the user enters a non integer,
     *              otherwise the integer entered.
     */
    public static int getChoice() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your choice.");

        if (in.hasNextInt()) {
            return in.nextInt();
        } else {
            in.nextLine();
            return -1;
        }
    }

    /**
     * Prints the feedback of the user's choice.
     *
     * @param choice        the choice of the user
     * @throws IllegalArgumentException     the exception when a user enters an invalid value
     */
    public static void printChoice(int choice) throws IllegalArgumentException {

        try {
            switch (choice) {
                case 1:
                    System.out.println("Option 1.\n");
                    break;
                case 2:
                    System.out.println("Option 2.\n");
                    break;
                case 3:
                    System.out.println("Option 3.\n");
                    break;
                case 4:
                    System.out.println("Option 4.\n");
                    break;
                case 5:
                    System.out.println("You chose to exit.\n");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    throw new IllegalArgumentException("Invalid choice.");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }

        return;
    }
}
