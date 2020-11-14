import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a width:");
        int width = input.nextInt();

        System.out.println("Enter a height:");
        int height = input.nextInt();

        for (int i = 0; i < height; i++) {
            System.out.print("*"); // FIRST COLUMN

            for (int j = 0; j < width - 2; j++) {
                // FIRST AND LAST ROW SHOULD BE ASTERISKS
                if (i == 0 || i == height - 1) System.out.print("*");

                // ROWS INSIDE THE FIRST/LAST SHOULD BE DASHES
                else System.out.print("-");
            }

            System.out.println("*"); // LAST COLUMN
        }

    }
}
