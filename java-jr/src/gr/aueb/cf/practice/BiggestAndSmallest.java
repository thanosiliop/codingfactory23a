package gr.aueb.cf.practice;

import java.util.Scanner;

public class BiggestAndSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Please insert number of numbers");
        n = in.nextInt();

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.println("Number " + i + ": ");
            int num = in.nextInt();
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}
