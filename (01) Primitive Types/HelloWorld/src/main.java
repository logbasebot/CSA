public class main {

    public static void main (String [] args) {
        // BASIC VARIABLE INTRO:

        /*

        String welcome = "Hello, world!"; // HOLDS STRING VALUES
        int grade = 10; // HOLDS WHOLE NUMBERS +-
        double temperature = 98.6; // HOLDS DECIMAL
        boolean likesCoffee = true; // TRUE OR FALSE

        System.out.println(welcome);
        System.out.println("My name is Santiago.");
        System.out.print("I am in ");
        System.out.println(grade + "th grade.");
        System.out.println("Hooray!");

        int feet = 5;
        int inches = 11;

        System.out.println("I am " + feet + " feet, " + inches + " inches tall."); // STRING CONCATENATION

        */

        //MATH EXAMPLE 1:

        System.out.println(123);
        System.out.println(123 + 456); // ADDITION OPERATOR
        System.out.println(123 - 456); // SUBTRACTION OPERATOR
        System.out.println(123 * 456); // MULTIPLICATION OPERATOR
        System.out.println(123 / 456); // DIVISION OPERATOR
        System.out.println(123 % 456); // MODULUS OPERATOR (REMAINDER)

        int num1 = 10;
        int num2 = 2;

        int sum = num1 + num2;

        System.out.println(sum);

        int num3 = 3;

        sum = (num1 + num2) + num3;

        System.out.println(sum);

        double d1 = 123.456;
        double d2 = 78.9;

        double product = d1*d2;
        System.out.println(product);

        double quotient = d1/d2;
        System.out.println(quotient);

        int count = 15;

        count += 10;
        count -= 10;
        count *= 10;
        count /= 10;
        count %= 10;

        System.out.println(count);

        count = count + 1; // FULL STATEMENT
        count += 1; // SHORTHAND
        count++; // ONLY FOR 1

        count = count - 1;
        count -= 1;
        count--; //ONLY FOR 1

        int countdown = 10;
        System.out.println(countdown);
        countdown --;
        System.out.println(countdown);

        final double pi = 3.14159; // CANNOT REASSIGN VARIABLE

    }
}
