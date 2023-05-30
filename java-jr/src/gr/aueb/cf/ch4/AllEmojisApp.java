package gr.aueb.cf.ch4;

public class AllEmojisApp {

    public static void main(String[] args) {
        int emojiStart = 0x1f600;
        int emojiEnd = 0x1f64f;
        int i = 0;

        i = emojiStart;
        while (i <= emojiEnd) {
            System.out.print(Character.toChars(i));
            System.out.print(" ");
            i++;
            if (i % 16 == 0) System.out.println();
        }
    }
}
