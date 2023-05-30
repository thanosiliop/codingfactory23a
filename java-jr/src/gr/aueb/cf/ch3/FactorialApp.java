package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει και εμφανίζει το άθροισμα
 * και το γινόμενο
 * των πρώτων n αριθμών που επιλέγει
 * ο χρήστης.
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0L;
        long facto = 1L;
        int n = 0;
        int i = 1;

        System.out.println("Please insert the number of numbers you want:");
        n = in.nextInt();

        while (i <= n) {
            sum += i;
            facto *= i;
            i++;
        }

        System.out.printf("Sum = %d\n%d! = %,d", sum, n, facto);
    }
}
