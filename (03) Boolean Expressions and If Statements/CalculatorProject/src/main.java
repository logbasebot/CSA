import java.util.Scanner;

public class main {

    public static void main (String[] args) {
        Calculator myCalc = new Calculator(); // CALCULATOR OBJECT

        Scanner input = new Scanner(System.in); // SCANNER OBJECT

        boolean running = true;

        while (running) {
            System.out.println("====CALCULATOR MENU====");
            System.out.println("[1] Add\n[2] Subtract\n[3] Multiply\n[4] Divide" +
                    "\n[5] Reset\n[6] Quit" );

            System.out.println("Your choice: ");
            int choice = input.nextInt(); // GET INPUT

            if (choice == 1) {
                System.out.println("Enter the first number: ");
                double a = input.nextDouble();

                System.out.println("Enter the second number: ");
                double b = input.nextDouble();

                System.out.println(a + " + " + b + " = " + myCalc.add(a, b) );
                System.out.println("Number of calculations: " + myCalc.getCount() );
            }
            if (choice == 2) {
                System.out.println("Enter the first number: ");
                double a = input.nextDouble();

                System.out.println("Enter the second number: ");
                double b = input.nextDouble();

                System.out.println(a + " - " + b + " = " + myCalc.subtract(a, b) );
                System.out.println("Number of calculations: " + myCalc.getCount() );
            }
            if (choice == 3) {
                System.out.println("Enter the first number: ");
                double a = input.nextDouble();

                System.out.println("Enter the second number: ");
                double b = input.nextDouble();

                System.out.println(a + " * " + b + " = " + myCalc.multiply(a, b) );
                System.out.println("Number of calculations: " + myCalc.getCount() );
            }
            if (choice == 4) {
                System.out.println("Enter the first number: ");
                double a = input.nextDouble();

                System.out.println("Enter the second number: ");
                double b = input.nextDouble();

                System.out.println(a + " / " + b + " = " + myCalc.divide(a, b) );
                System.out.println("Number of calculations: " + myCalc.getCount() );
            }
            if (choice == 5) {
                System.out.println("Are you sure you want to reset the calculator?");
                System.out.println("[1] YES\n[2] NO");

                int reset = input.nextInt();

                if (reset == 1) {
                    myCalc.reset();
                }
                // IF reset IS 2, SIMPLY IGNORE THE INPUT
            }
            if (choice == 6) {
                System.out.println("Are you sure you want to quit?");
                System.out.println("[1] YES\n[2] NO");

                int quit = input.nextInt();

                // GOLF!!! running = (quit == 1) ? true : false;
                if (quit == 1) {
                    running = false;
                }
                // IF quit IS 2, SIMPLY IGNORE THE INPUT
            }
        }

    }

}