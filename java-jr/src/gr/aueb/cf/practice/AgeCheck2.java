package gr.aueb.cf.practice;

import java.util.Scanner;

public class AgeCheck2 {
        public static void main(String[] args) {
            System.out.print("Your age? ");
            Scanner console = new Scanner(System.in);
            int myAge = console.nextInt();
            message(myAge);
        }

        // Displays message about driving to user based on given age
        public static void message(int age) {
            if (age >= 21) {
                System.out.println("I can legally purchase alcohol!");
                System.out.println("I can purchase a ticket to an R-rated movie.");
                System.out.println("I can get my driver's license!");
            } else if (age >= 17) {
                System.out.println("I can purchase a ticket to an R-rated movie.");
                System.out.println("I can get my driver's license!");
            } else if (age == 16) {
                System.out.println("I can get my driver's license!");
            }
        }
}
