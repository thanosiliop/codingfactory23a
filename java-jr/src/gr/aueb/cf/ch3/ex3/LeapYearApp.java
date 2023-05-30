package gr.aueb.cf.ch3.ex3;

/**
 * Ο χρήστης εισάγει ένα έτος και
 * η εφαρμογή εμφανίζει αν είναι
 * δίσεκτο.
 */

import java.util.Scanner;

public class LeapYearApp {
    public static void main(String[] args) {

        //Αρχικοποίηση και δήλωση μεταβλητών
        Scanner in = new Scanner(System.in);
        boolean leapYear = false;
        int year;

        System.out.println("Please enter a year:");
        year = in.nextInt();

        //Εντολές
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            leapYear = true;
        } else leapYear = false;

        //Εμφάνιση αποτελεσμάτων
        if (leapYear == true) {
            System.out.printf("%d is a leap year", year);
        } else System.out.printf("%d is not a leap year", year);
    }
}
