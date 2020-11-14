import java.util.Scanner;

public class main {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        CombinationLock combo = new CombinationLock(4, 2, 0);

        while (true) {
            System.out.println("====OPTIONS====");
            System.out.println("(1) Check State\n(2) Lock\n(3) Unlock\n(4) Reset Combination");

            int choice = input.nextInt(); // TAKE USER'S CHOICE

            if (choice == 1) {
                combo.GetState(); // RETURN STATE (LOCKED, UNLOCKED)
            }

            if (choice == 2) {
                combo.Lock(); // STATE: LOCKED
            }

            if (choice == 3) {
                System.out.println("==Input the combination=="); // GET OLD COMBO

                System.out.println("First Number: ");
                int num1 = input.nextInt();

                System.out.println("Second Number: ");
                int num2 = input.nextInt();

                System.out.println("Third Number: ");
                int num3 = input.nextInt();

                combo.Unlock(num1, num2, num3); // VERIFY, UNLOCK 
            }

            if (choice == 4) {
                System.out.println("==Input Current Combination=="); // GET OLD COMBO

                System.out.println("First Number: ");
                int num1 = input.nextInt();

                System.out.println("Second Number: ");
                int num2 = input.nextInt();

                System.out.println("Third Number: ");
                int num3 = input.nextInt();

                System.out.println("==Input New Combination=="); // GET NEW COMBO

                System.out.println("First Number: ");
                int num4 = input.nextInt();

                System.out.println("Second Number: ");
                int num5 = input.nextInt();

                System.out.println("Third Number: ");
                int num6 = input.nextInt();

                combo.ResetCombination(num1, num2, num3, num4, num5, num6); // RESET COMBO
            }

        }

    }
}