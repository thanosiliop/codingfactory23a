package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Encrypts a string and can also
 * decrypt an encrypted one.
 */
public class Exercise7 {

    public static void main(String[] args) {

        System.out.println("Please enter a phrase to encrypt.");
        String s1 = getString();

        StringBuilder encrypted = encrypt(s1);
        System.out.println("Encrypted phrase is: " + encrypted);

        System.out.println("Please enter a phrase to decrypt.");
        String s2 = getString();

        StringBuilder decrypted = decrypt(s2);
        System.out.println("Decrypted phrase is: " + decrypted);
    }

    /**
     * Takes a string from the user.
     *
     * @return      the string which the user inserts.
     */
    public static String getString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    };

    /**
     * Takes a string and returns it encrypted,
     * changes each character with its next one
     * in ASCII.
     *
     * @param s     The string to encrypt.
     * @return      The encrypted string.
     */
    public static StringBuilder encrypt(String s) {
        StringBuilder sEncrypted = new StringBuilder();
        char next = 0;
        for (int i = 0; i < s.length(); i++) {
            next = (char) (s.charAt(i) + 1);
            sEncrypted = sEncrypted.append(next);
        }
        return sEncrypted;
    }

    /**
     * Takes a string and returns it decrypted,
     * changes each character with its previous
     * in ASCII.
     *
     * @param s     The string to decrypt.
     * @return      The decrypted string.
     */
    public static StringBuilder decrypt(String s) {
        StringBuilder decrypted = new StringBuilder();
        char previous = 0;
        for (int i = 0; i < s.length(); i++) {
            previous = (char) (s.charAt(i) - 1);
            decrypted = decrypted.append(previous);
        }
        return decrypted;
    }
}
