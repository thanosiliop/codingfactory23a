package gr.aueb.cf.ch10;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(new File("C:/tmp/lotto6in.txt"));
             PrintStream ps = new PrintStream("C:/tmp/lotto6out.txt", StandardCharsets.UTF_8)) {

            final int LOTTO_SIZE = 6;
            int[] inputNumbers = new int[49];
            int num;
            int[] result = new int[6];
            int pivot = 0;
            int window;

            while ((num = in.nextInt()) != -1 && pivot <= 48) {
                inputNumbers[pivot] = num;
                pivot++;
            }

            int[] numbers = Arrays.copyOfRange(inputNumbers, 0, pivot);
            Arrays.sort(numbers);

            window = pivot - LOTTO_SIZE;
            for (int i = 0; i <= window; i++) {
                for (int j = i + 1; j <= window + 1; j++) {
                    for (int k = j + 1; k <= window + 2; k++) {
                        for (int l = k + 1; l <= window + 3; l++) {
                            for (int m = l + 1; m <= window + 4; m++) {
                                for (int n = m + 1; n <= window + 5; n++) {
                                    result[0] = numbers[i];
                                    result[1] = numbers[j];
                                    result[2] = numbers[k];
                                    result[3] = numbers[l];
                                    result[4] = numbers[m];
                                    result[5] = numbers[n];

                                    if (!isEven(result, 4) && !isOdd(result, 4) && !isContiguous(result, 1)
                                        && !isSameEnding(result, 3) && !isSameTen(result, 3)) {
                                        ps.printf("%d %d %d %d %d %d\n", result[0], result[1], result[2], result[3], result[4], result[5]);
                                    }

                                }
                            }
                        }
                    }
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isEven(int[] arr, int threshold) {
        int even = 0;

        for (int num : arr) {
            if (num % 2 == 0) even++;
        }
         return even > threshold;
    }

    public static boolean isOdd(int[] arr, int threshold) {
        int odd = 0;

        for (int num : arr) {
            if (num % 2 != 0) odd++;
        }

        return odd > threshold;
    }

    public static boolean isContiguous(int[] arr, int threshold) {
        int contiguous = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] - 1) contiguous++;
        }

        return contiguous > threshold;
    }

    public static boolean isSameEnding(int[] arr, int threshold) {
        int sameEnding = 0;

        for (int i = 2; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) sameEnding++;
        }

        return sameEnding > threshold;
    }

    public static boolean isSameTen(int[] arr, int threshold) {
        int[] tens = new int[5];

        for (int num : arr) {
            for (int i = 0; i < 5; i++) {
                if (num / 10 == i) tens[i]++;
            }
        }

        for (int ten : tens) {
            if (ten > threshold) return true;
        }

        return false;
    }
}
