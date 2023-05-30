package gr.aueb.cf.ch4.ex4;

import java.util.Scanner;

public class StarsNVerticalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Please enter number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }
}
