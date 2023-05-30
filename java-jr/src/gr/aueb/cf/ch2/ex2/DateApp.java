package gr.aueb.cf.ch2.ex2;

import java.util.Scanner;

/**
 * Program which shows the date.
 */
public class DateApp {
    public static void main(String[] args) {

        //Αρχικοποίηση μεταβλητών
        int day, month, year;
        Scanner in = new Scanner(System.in);
        int ye;

        //Εντολές
        System.out.println("Παρακαλώ εισάγετε ημέρα, μήνα και έτος:");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        ye = year % 100;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Η ημερομηνία που δώσατε είναι: %02d/%02d/%02d", day, month, ye);
    }
}
