package gr.aueb.cf.ch6;

/**
 * Program that shows the second smallest value of an array.
 */
public class Exercise2 {

    public static void main(String[] args) {

        int[] arr = {5, 8, 3, 9, 4, 1, 2};
        int min, minPosition, tmp;

        for (int i = 0; i < arr.length - 1; i++) {

            minPosition = i;
            min = arr[minPosition];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }

            tmp = arr[i];
            arr[i] = min;
            arr[minPosition] = tmp;
        }

        System.out.printf("Second minimum value is %d", arr[1]);

    }
}
