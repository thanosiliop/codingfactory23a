package gr.aueb.cf.ch2;

public class ExpressionsApp {
    public static void main(String[] args) {
        /* αρχικοποίηση μεταβλητών
         */
        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        /*εντολές
         */
        result2 = num1++; //result2 -> 12   num1 = 13
        result2 = ++num2; //num2 -> 6  num2 = 6

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        result1 = result1 + 10;
        result1 += 10;

        result1 = result1 * 12;
        result1 *= 12;



        result1 = (num1 + num2 * (num2 - (15 / num1 % 4)));

    }
}
