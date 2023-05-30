package gr.aueb.cf.practice;

import java.util.Scanner;

public class DateIsBefore {
    public static boolean dateIsBefore (int m1, int d1, int m2, int d2) {
        boolean firstEarlier;

        if (m1 < m2) {
            firstEarlier = true;
        } else if (m1 == m2) {
            if (d1 < d2) {
                firstEarlier = true;
            } else firstEarlier = false;
        } else firstEarlier = false;

        return (firstEarlier == true) ? true : false;
    }
}
