package gr.aueb.cf.practice;

public class AsciiFigure {
    public static void main(String[] args) {
        int height = 3;
        int width = height * 7 - 3;
        int slashes = 0;
        int stars = width;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= slashes; j++) {
                System.out.print("/");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= slashes; j++) {
                System.out.print("\\");
            }
            System.out.println();
            slashes += 4;
            stars -= 8;
        }
    }
}




