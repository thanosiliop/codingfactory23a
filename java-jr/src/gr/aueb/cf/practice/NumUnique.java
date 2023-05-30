package gr.aueb.cf.practice;

import java.util.Scanner;

public class NumUnique {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3;
        int uniques = 0;

        System.out.println("Please insert three integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        if (num1 == num2 && num1 == num3) {
            uniques = 1;
        } else if (((num1 == num2) && (num1 != num3) && (num2 != num3)) || ((num1 != num2) && (num1 != num3) && (num2 == num3))
                || ((num1 != num2) && (num1 == num3) && (num2 != num3))) {
            uniques = 2;
        } else uniques = 3;

        System.out.println("Uniques = " + uniques);

    }
}
