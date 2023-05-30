package gr.aueb.cf.ch4.ex4;

import java.util.Scanner;

public class StarsNDescApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Please enter number to calculate stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
