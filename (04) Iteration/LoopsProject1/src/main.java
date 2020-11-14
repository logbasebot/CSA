import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        // SCANNER OBJECT
        Scanner input = new Scanner(System.in);

        // PROMPT THE USER
        System.out.println("Enter a length: ");

        // STORE LENGTH
        int s = input.nextInt();

        // LOOP - START AT S, DECREASE BY 1 EACH TIME
        for (int i = s; s > 0; s--) {
            System.out.println("Area of a square, length " + s + ": " + s*s); // SQUARE AREA
            System.out.println("Area of a circle, radius " + s + ": " + s*s*Math.PI); // CIRCLE AREA
        }

    }
}
