package gr.aueb.cf.ch10;

import java.util.Arrays;

/**
 * Finds the max sum of a sub-array in an array of numbers
 * and the sub-array itself.
 */
public class Project6 {

    public static void main(String[] args) {
        //Array initialization
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        //Getting the maxSubArray
        int[] maxSubArray = findMaxSubArray(arr);

        //Prints the digits of the maxSubArray
        for (int numbers : maxSubArray) {
            System.out.print(numbers + " ");
        }

        System.out.println();

        //Prints the max sum
        int maxSum = 0;
        for (int numbers : maxSubArray) {
            maxSum += numbers;
        }
        System.out.println(maxSum);
    }


    /**
     * From an array of numbers this algorithm finds the max sub-array
     * with O(n) time complexity because it runs the elements of an array
     * one time (one for, for n elements). The variable max_so_far keeps the
     * maximum of the whole array, while max_ending_here keeps the maximum of
     * the sub-array until the index i. When max_ending_here becomes less than 0
     * there is no point in keeping the previous sum so we make it 0 and start
     * counting from the next number of the array to find the max sub-array (we
     * do this using the variable s and when max_so_far is less than max_ending_here
     * max_so_far becomes max_ending_here and we allocate s to start and i to end variable
     * to keep the indexes of the max sub-array).
     *
     * @param arr the array of numbers to find the maximum sub-array.
     * @return    the maximum sub-array.
     *
     */
    public static int[] findMaxSubArray(int[] arr) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int start = 0;
        int end = 0;
        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            max_ending_here += arr[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
