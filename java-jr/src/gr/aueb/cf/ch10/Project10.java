package gr.aueb.cf.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Project10 {

    public static boolean[][] seats = new boolean[30][12];

    public static void main(String[] args) {

        //Υποθέτουμε ότι όλες οι θέσεις είναι ελεύθερες
        for (int i = 0; i <= 29; i++) {
            for (int j = 0; j <= 11; j++) {
                seats[i][j] = false;
            }
        }

        //Αρχικοποιούμε τις μεταβλητές που θα χρειαστούμε
        String choice;
        boolean quit = false;
        char column;
        int row;

        //Προτρέπουμε το χρήστη να εισάγει επιλογή για κράτηση ή ακύρωση
        do {
            System.out.println("Enter 1 to book a seat, 2 to cancel your booked seat, q or Q to quit.");
            try {
                Scanner in = new Scanner(System.in);
                choice = in.nextLine().trim();
                if (choice.matches("[Qq]")) quit = true;
                else if (Integer.parseInt(choice) == 1) {
                    column = getColumn();
                    row = getRow();
                    book(column, row);
                } else if (Integer.parseInt(choice) == 2) {
                    column = getColumn();
                    row = getRow();
                    cancel(column, row);
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter a valid choice");
                continue;
            }
        } while (!quit);



    }

    public static char getColumn() {
        char column;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter the column, if more than a char entered, the first will be chosen");
                column = sc.next().charAt(0);
                column = Character.toUpperCase(column);
                if (column < 'A' || column > 'L') {
                    throw new IllegalArgumentException();
                } else break;
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong column, enter again");
                continue;
            }
        }
        return column;
    }

    public static int getRow() {
        int row;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter the row between 1 and 30");
                row = sc.nextInt();
                if (row < 1 || row > 30) {
                    throw new IllegalArgumentException();
                } else break;
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong row, enter again");
                continue;
            } catch (InputMismatchException ex) {
                System.out.println("Please enter an integer");
                continue;
            }
        }
        return row;
    }

    public static void book(char column, int row) {

        if (!seats[row][column - 65]) {
            seats[row][column - 65] = true;
            System.out.printf("Seat %c%d is booked successfully\n", column, row);
        } else {
            System.out.printf("Seat %c%d is already booked, try another one.\n", column, row);
        }
    }

    public static void cancel(char column, int row) {

        if (seats[row][column - 65]) {
            seats[row][column - 65] = false;
            System.out.printf("Seat %c%d is cancelled successfully.\n", column, row);
        } else {
            System.out.printf("The seat %c%d which you chose is free.\n", column, row);
        }

    }
}
