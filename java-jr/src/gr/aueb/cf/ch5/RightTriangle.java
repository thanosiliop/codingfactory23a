package gr.aueb.cf.ch5;
/**
 *
 */

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please insert 3 sides of the triangle");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = ((Math.abs(a*a - (b*b + c*c)) <= EPSILON));

        if (isRight = true) {
            System.out.println("Triangle is right");
        } else {
            System.out.println("Triangle is not right");
        }
    }
}
