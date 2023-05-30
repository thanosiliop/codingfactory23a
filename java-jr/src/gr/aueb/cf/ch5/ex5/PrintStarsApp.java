package gr.aueb.cf.ch5.ex5;

import java.util.Scanner;

/**
 * Εκτυπώνει ένα μενού επιλογών και λαμβάνει από τον χρήστη
 * αριθμό αστερίσκων και επιλογή εμφάνισης σχήματος εκτύπωσης
 * αστερίσκων. Στη συνέχεια εκτυπώνει το αντίστοιχο σχήμα με
 * αστερίσκους.
 */

public class PrintStarsApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int n = 0;

        do {
            printMenu();

            //Εισαγωγή παραμέτρων
            System.out.println("Εισάγετε επιλογή εμφάνισης:");
            choice = in.nextInt();

            System.out.println("Εισάγετε αριθμό αστερίσκων:");
            n = in.nextInt();

            //Έλεγχος παραμέτρων και εμφάνιση αποτελέσματος
            if (n <= 0) {
                System.out.println("Παρακαλώ εισάγετε θετικό αριθμό αστερίσκων");
                continue;
            }

            switch (choice) {
                case 1:
                    printNHorizontal(n);
                    break;
                case 2:
                    printNVertical(n);
                    break;
                case 3:
                    printNTimesN(n);
                    break;
                case 4:
                    printNtimesOneToN(n);
                    break;
                case 5:
                    printNtimesNToOne(n);
                    break;
                case 6:
                    System.out.println("Επιλέξατε έξοδο.");
                    break;
                default:
                    System.out.println("Μη έγκυρη επιλογή");
            }
        } while (choice != 6);
    }


    public static void printMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή:");
    }

    public static void printNHorizontal(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void printNVertical(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printNTimesN(int n) {
        for (int i = 1; i <= n; i++) {
            printNHorizontal(n);
            System.out.println();
        }
    }

    public static void printNtimesOneToN(int n) {
        for (int i = 1; i <= n; i++) {
            printNHorizontal(i);
            System.out.println();
        }
    }

    public static void printNtimesNToOne(int n) {
        for (int i = n; i >= 1; i--) {
            printNHorizontal(i);
            System.out.println();
        }
    }
}

