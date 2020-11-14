import java.util.Scanner;

public class main {

    public static void main (String[] args) {

        // LOOP TYPE                // RANGE                    // REASON
        // while                    0 - infinity                To run indefinitely.
        // for                      0 - infinity                To run definitely.
        // do-while                 1 - infinity                To run indefinitely, at least ONCE.

        Scanner input = new Scanner(System.in);

        int num = 0;
        int failsafe = 0;

        // ITERATION: CHECK CONDITION -> RUN CODE (AS LONG AS IT IS TRUE)
        // INCREMENT VARIABLE IN CONDITION! OTHERWISE, YOU GET AN INFINITE LOOP
        while (num < 10) {
            System.out.println(num);

            failsafe++;

            if (failsafe > 1000) {
                System.out.println("Stuck in a loop!");
                break; // JUMP OUT OF THE LOOP!
            }

        }

        // INITIALIZATION, BOOLEAN EXPRESSION, INCREMENTOR
        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        }

        // DECREMENTOR
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 100; i += 2) {
            System.out.println(i);
        }

        int choice = 0;

        // OCCURS AT LEAST ONCE
        do {
            System.out.println("Enter a number from 1 to 4: ");
            choice = input.nextInt();

        } while (choice < 1 || choice > 4);

        
    }

}
