package gr.aueb.cf.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Max value? ");
        int maxValue = in.nextInt();

        for (int i = 1; i <= maxValue; i++) {
            if ((i % 3 != 0) && (i % 5 !=0)) {
                System.out.print(i + " ");
            } else if ((i % 3 == 0) && (i % 5 ==0)) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else System.out.print("Buzz ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
