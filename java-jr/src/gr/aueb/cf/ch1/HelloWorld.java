package gr.aueb.cf.ch1;

import gr.aueb.cf.ch1.model.Point;
import static java.lang.Math.abs;

import java.util.Scanner;

/**
 * ektypwnei stin konsola (standard output)
 * ti frasi Hello World!
 *
 * @author a8ana
 */
public class HelloWorld {

    private Scanner sc = new Scanner(System.in);
    private Point point;
    private String s;

    public static void main(String[] args) {
        int abs = abs(-3);
        System.out.println("Hello World!");
    }
}
