package gr.aueb.cf.ch10;

import java.util.Arrays;

/**
 * Given an array of arrival and exiting times of multiple cars in a parking lot,
 * the application finds the maximum number of cars being simultaneously parked.
 */
public class Project4 {

    public static void main(String[] args) {

        //The given array of arrival and exiting times
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};

        int[][] transformed = getTransformed(arr);

        int maxCount = getMaxCount(transformed);

        System.out.printf("Ο μέγιστος αριθμός αυτοκινήτων που είναι σταθμευμένα την ίδια στιγμή είναι %d", maxCount);

    }

    /**
     * Transforms the given array (arr) to an array in which the first field is
     * occupied by the time and in the second field 1 if it is arrival time and
     * 0 if it is time of exit.
     * @param arr   the given array of arrivals and exits.
     * @return      the transformed array.
     */
    public static int[][] getTransformed(int[][] arr) {
        int[][] transformed = new int[arr.length * 2][2];

        for (int i = 0; i < arr.length; i++) {
            transformed[i * 2][0] = arr[i][0];
            transformed[i * 2][1] = 1;
            transformed[(i * 2) + 1][0] = arr[i][1];
            transformed[(i * 2) + 1][1] = 0;
        }
        return transformed;
    }

    /**
     * It takes the previously transformed array as an input and
     * calculates the max number of cars parked in the same time.
     * It adds 1 to the maxCount for arrival time and subtracts 1
     * for exiting time after the array is sorted by the times.
     * @param transformed the array we made in the previous method.
     * @return            the maxCount of cars concurrently parked.
     */
    public static int getMaxCount(int[][] transformed) {
        Arrays.sort(transformed, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < transformed.length; i++) {
            if (transformed[i][1] == 1) {
                count++;
                if (count > maxCount) maxCount = count;
            } else count--;
        }
        return maxCount;
    }
}
