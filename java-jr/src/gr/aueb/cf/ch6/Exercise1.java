package gr.aueb.cf.ch6;

/**
 * Program that uses a method to find
 * the maximum value of an array.
 */
public class Exercise1 {
    public static void main(String[] args) {

        int[] grades = {4, 8, 10, 3, 6, 2, 1, 4};
        int maxPosition = 0;

        maxPosition = getMaxPosition(grades, 0, grades.length - 1);

        if (maxPosition != -1) {
            System.out.printf("Max value is in position %d and is %d", maxPosition + 1, grades[maxPosition]);
        }

    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        if (arr == null) return -1;
        if ((low < 0) || (high > arr.length - 1)) {
            System.out.println("Error in array dimensions.");
            return -1;
        }
        if (low > high) {
            System.out.println("Error in array dimensions.");
            return -1;
        }

        int maxPosition = low;
        int maxValue = arr[maxPosition];

        for (int i = low; i < high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }
}
