package gr.aueb.cf.ch3.ex3;

/**
 * Εμφανίζει επαναληπτικά ένα μενού 5
 * επιλογών, ζητάει επιλογή από τον χρήστη και
 * του εμφανίζει το αντίστοιχο μήνυμα έως ότου
 * ο χρήστης επιλέξει έξοδο.
 */

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            System.out.println("Παρακαλώ επιλέξτε κάποιο από τα παραπάνω");
            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή\n");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή\n");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση\n");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση\n");
            } else System.out.println("Δεν επιλέξατε κάποιο από τα παραπάνω\n");
        } while (choice != 5);
        System.out.println("Επιλέξατε έξοδο");
    }
}
