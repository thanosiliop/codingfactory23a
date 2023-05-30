package gr.aueb.cf.ch4.ex4;
/**
 * Εμφανίζει n αστέρια οριζόντια
 */

import java.util.Scanner;

public class StarsNHorizontalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Please enter number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
