package gr.aueb.cf.practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This program lists the Fibonacci sequence.");
        int n1 = 0, n2 = 1, n3 = 0, maxValue;

        System.out.println("Max value? ");
        maxValue = in.nextInt();

        System.out.print(n1 + n2);

        while (n3 < maxValue) {
            n3 = n1 + n2;
            System.out.print(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
