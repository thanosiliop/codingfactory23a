package gr.aueb.cf.ch10;

import java.util.Arrays;

/**
 * Makes a shallow copy of a two-dimensions array and shows that if we change
 * a value of the copy it also affects the original one.
 * Makes a deep copy of a two-dimensions array and shows that the aforementioned
 * behaviour does not happen in this case.
 */
public class Project7 {

    public static void main(String[] args) {

        //Initialization of the original array
        int[][] original = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0},{0, 0, 0}, {0, 0, 0},{0, 0, 0}, {0, 0, 0},{0, 0, 0}, {0, 0, 0}};

        int[][] shallowCopy1 = shallowCopy(original);

        int[][] shallowCopy2 = shallowCopy(original);

        int[][] deepCopy = deepCopy(original);

        shallowCopy2[2][2] = 1;

        //Shows that by changing shallowCopy2 both shallowCopy1 and the original are affected
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                System.out.print(original[i][j] + " ");
            }
        }

        for (int i = 0; i < shallowCopy1.length; i++) {
            for (int j = 0; j < shallowCopy1[i].length; j++) {
                System.out.print(shallowCopy1[i][j] + " ");
            }
        }

        System.out.println();

        deepCopy[0][0] = 1;

        //Shows that by changing the deepCopy the original is not affected
        for (int[] arrays : original) {
            for (int i = 0; i < arrays.length; i++) {
                System.out.print(arrays[i] + " ");
            }
        }

    }

    /**
     * Shallow copies an array.
     * @param original the original array.
     * @return         the shallow copied array
     */
    public static int[][] shallowCopy(int[][] original) {
        return Arrays.copyOf(original, original.length);
    }

    /**
     * Deep copies an array
     * @param original the original array.
     * @return         the deep copied array.
     */
    public static int[][] deepCopy(int[][] original) {
        int[][] copy = new int[original.length][original[0].length];
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                copy[i][j] = original[i][j];
            }
        }
        return copy;
    }
}
