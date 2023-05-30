package gr.aueb.cf.practice;

import java.util.Scanner;

public class SentinelSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, num = 0;

        System.out.print("Type a number: ");
        num = in.nextInt();

        while (num != -1) {
            sum += num;
            System.out.print("Type a number: ");
            num = in.nextInt();
        }

        System.out.println("Sum is " + sum);
    }
}
