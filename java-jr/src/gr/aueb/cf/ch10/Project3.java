package gr.aueb.cf.ch10;

import java.io.*;
import java.util.Arrays;

/**
 * Reads all characters from a .txt file and puts them in a two-sized
 * array with the character on the first column and the frequency it
 * appears on the text file on the second column. Then prints the array
 * sorted by the character and then by the frequency.
 */
public class Project3 {
    public static void main(String[] args) {

        //Initialization and nullification of the two sized array
        int[][] charFreq = new int[256][2];

        for (int i = 0; i < charFreq.length; i++) {
            charFreq[i][0] = 0;
            charFreq[i][1] = 0;
        }

        getFrequency(charFreq);

        printCharacter(charFreq);

        printFrequency(charFreq);
    }

    /**
     * Measures the frequency of each character contained in the input file.
     * @param charFreq the array in which the data is stored.
     */
    public static void getFrequency(int[][] charFreq) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/tmp/text.txt"));
            int c;
            while ((c = br.read()) != -1) {
                char ch = (char) c;

                if (Character.isDefined(ch)) {
                    charFreq[ch][1]++;
                    if (charFreq[ch][0] == 0) {
                        charFreq[ch][0] = ch;
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Sorts the array by the character and prints it
     * @param charFreq the array in which the data is stored.
     */
    public static void printCharacter(int[][] charFreq) {
        Arrays.sort(charFreq, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println("Ταξινόμηση κατά χαρακτήρα");
        System.out.printf("%-10s %-10s %n", "Χαρακτήρας", "Συχνότητα");
        for (int i = 0; i < charFreq.length; i++) {
            if (charFreq[i][0] != 0) {
                System.out.printf("%-10c %-10d %n", charFreq[i][0], charFreq[i][1]);
            }
        }
    }

    /**
     * Sorts the array by the frequency of appearance and prints it.
     * @param charFreq the array in which the data is stored.
     */
    public static void printFrequency(int[][] charFreq) {
        Arrays.sort(charFreq, (a, b) -> Integer.compare(b[1], a[1]));
        System.out.println("\nΧαρακτήρες κατά φθίνουσα συχνότητα:");
        System.out.printf("%-10s %-10s %n", "Χαρακτήρας", "Συχνότητα");
        for (int i = 0; i < charFreq.length; i++) {
            if (charFreq[i][0] != 0) {
                System.out.printf("%-10c %-10d %n", charFreq[i][0], charFreq[i][1]);
            }
        }
    }
}
