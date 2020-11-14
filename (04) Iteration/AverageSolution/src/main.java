import java.util.Scanner;

public class main {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        // PROMPT USER
        System.out.println("How many scores do you want to enter?");
        double j = input.nextInt();

        // CREATE VARIABLES BEFOREHAND
        double sum = 0;
        double minNum = 1000000000;
        double maxNum = -1000000000;

        for (int i = 1; i <= j; i++) {
            System.out.println("Enter score #" + i + ": ");
            double temp = input.nextInt();

            // ADD CURRENT TO TOTAL SUM
            sum += temp;

            // UPDATE MIN AND MAX VALUES
            minNum = Math.min(minNum, temp);
            maxNum = Math.max(maxNum, temp);
        }

        System.out.println("Average score: " + sum/j);
        System.out.println("The lowest score is: " + minNum);
        System.out.println("The highest score is: " + maxNum);

    }

}
