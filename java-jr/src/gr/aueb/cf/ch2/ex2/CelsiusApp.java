package gr.aueb.cf.ch2.ex2;

import java.util.Scanner;

/**
 * We create a program which
 * converts fahrenheit to celsius.
 */
public class CelsiusApp {
    public static void main(String[] args) {

        //Αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int fahren = 0;
        int celsius = 0;

        //Εντολές
        System.out.println("Παρακαλώ εισάγετε θερμοκρασία Fahrenheit:");
        fahren = in.nextInt();
        celsius = (5 * (fahren - 32)) / 9;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Οι %d\u00B0F αντιστοιχούν σε %d\u00B0C.", fahren, celsius);
    }
}
