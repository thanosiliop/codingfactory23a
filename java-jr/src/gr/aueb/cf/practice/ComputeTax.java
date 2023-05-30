package gr.aueb.cf.practice;

import java.util.Scanner;

public class ComputeTax {

    public static final int LEVEL_2 = 7150;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float salary;
        System.out.println("Please insert salary (float)");
        salary = in.nextFloat();
        System.out.printf("Tax to be payed for %.02f is %.02f.", salary, computeTax(salary));
    }

    public static float computeTax(float salary) {
        float tax = 0;
        final float LEVEL_1 = 7150F;
        final float LEVEL_2 = 29050F;
        final float LEVEL_3 = 70350F;
        if (salary <= LEVEL_1) {
            tax = salary / 10;
        } else if (salary <= LEVEL_2) {
            tax = (float) ((LEVEL_1 / 10) + (salary - LEVEL_1) * 0.15);
        } else if (salary <= LEVEL_3) {
            tax = (float) ((LEVEL_1 / 10) + ((LEVEL_2 - LEVEL_1) * 0.15) + ((salary - LEVEL_2) * 0.25));
        } else {
            tax = (float) (((LEVEL_1 / 10) + ((LEVEL_2 - LEVEL_1) * 0.15) + ((LEVEL_3 - LEVEL_2) * 0.25)) + ((salary - LEVEL_3) * 0.28));
        }
        return tax;
    }
}
