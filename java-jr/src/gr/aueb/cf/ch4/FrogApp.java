package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * Ο frog βρίσκεται στη θέση Χ και θέλει να φτάσει στη
 * θέση Υ (ή σε θέση > Υ). Ο frog jumps a fixed distance, D.
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο small frog πρέπει
 * να κάνει ώστε να φτάσει (ή να ξεπεράσει) τον στόχο.
 *
 * Για παράδειγμα, αν έχουμε:
 * Χ = 10
 * Υ = 85
 * D = 30
 *
 * τότε ο small frog θα χρειαστεί 3 jumps, γιατί:
 * Starts at 10, και μετά το 1ο jump πάει στη θέση 10 + 30 = 40
 * στο 2ο jump πάει 40 + 30 = 70
 * και στο 3ο jump πάει 70 + 30 = 100
 */

//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int x, y, d;
//        int jumps = 0;
//
//        System.out.println("Please provide entry point, ending point and distance covered");
//        x = in.nextInt();
//        y = in.nextInt();
//        d = in.nextInt();
//
//        for (int i = x; i < y; i += d) {
//            jumps++;
//        }
//
//        System.out.println("Jumps = " + jumps);
//    }
//}

public class FrogApp {

    public static void main(String[] args) {
        int jumps = 0;
        int x = 10;
        int y = 85;
        int jmp = 30;
                                                        //Η Math.ceil() δίνει τον μικρότερο μεγαλύτερο ακέραιο δεκαδικού
        jumps = (int) Math.ceil((y-x) / (double) jmp); //Math.ceil() δίνει double
    }
}