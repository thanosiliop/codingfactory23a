package gr.aueb.cf.ch6;

/**
 * Αναζητά το ελάχιστο και μέγιστο
 * στοιχείο ενός πίνακα.
 */
public class ArrayMinMaxApp {

    public static void main(String[] args) {
        int[] arr = {30, 12, 80, 7, 15};

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }

        System.out.printf("Min value : %d, Min Position: %d", minValue, minPosition + 1);

    }
}
