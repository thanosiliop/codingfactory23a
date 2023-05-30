package gr.aueb.cf.practice;

import java.util.Scanner;

public class FloydsTriangle {
    public static void floydsTriange(int k) {

        if (k < 0) {
            System.out.print("no output");
        } else {
            int num = 1;
            int row = 1;
            while (row <= k) {
                int col = 1;
                while (col <= row) {
                    System.out.print(num + " ");
                    num++;
                    col++;
                }
                System.out.println();
                row++;
            }
        }
    }
}
