package gr.aueb.cf.ch2;

import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args) {
        //Αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int amount, remainingAmount, euros500, euros100, euros50, euros20, euros10, euro1;

        //Εντολές
        System.out.println("Please enter the amount of euros:");
        amount = in.nextInt();
        euros500 = amount / 500;
        remainingAmount = amount % 500;
        euros100 = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        euros50 = remainingAmount / 50;
        remainingAmount = remainingAmount % 50;
        euros20 = remainingAmount / 20;
        remainingAmount = remainingAmount % 20;
        euros10 = remainingAmount / 10;
        euro1 = remainingAmount % 10;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("You will get %d bills of 500, %d bills of 100, %d bills of 50, %d bills of 20, %d bills of 10 and %d euros.",
                euros500, euros100, euros50, euros20, euros10, euro1);


    }
}
