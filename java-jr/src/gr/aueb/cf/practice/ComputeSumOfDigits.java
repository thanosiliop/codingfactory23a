package gr.aueb.cf.practice;

import java.util.Scanner;

public class ComputeSumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type an integer: ");
        int inputNum = in.nextInt();
        int digitSum = 0;
        int num = inputNum;

        while (num != 0) {
            digitSum += num % 10;
            num /= 10;
        }

        System.out.print("Digit sum is " + digitSum);
    }
}
