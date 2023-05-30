package gr.aueb.cf.practice;

public class BottlesOfRootBeer {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println(i + " bottles of root beer on the wall\n" +
                    + i + " bottles of root beer\n" +
                    "Take one down, pass it around\n" +
                    (i-1) + " bottles of root beer on the wall\n");
        }
    }
}
