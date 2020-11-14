/* PRIMITIVE TYPES PROJECT
   SANTIAGO CHRIST
   PERIOD 1
   08/31/2020 */
public class main {
    public static void main (String[] args) {

        // WORKING WITH INTS
        int i = 4;
        int j = 2*i;
        int k = i + 5;

        // WORKING WITH DOUBLES
        double d = k;
        d -= 2.5;
        double mod = j%2;

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value of j modulated by 2 is: " + mod);
        System.out.print("The value of i is: " + i + "\nThe value of j is: " + j + "\nThe value of k is: " + k);

        /* LINE BREAK ESCAPE USED BELOW, AS PREVIOUS LINE OF CODE HAS TO BE PRINT
        (NOT PRINTLN, SO I'M JUST KEEPING THE CONSOLE NEAT) */

        System.out.println("\n" + d + " \t" + (int)d);

        String student_name = "Santiago Christ";
        System.out.println("My name is: " + student_name);

        String msg1 = "Mr. Sushil says, ";
        String msg2 = "\"Programming in Java is fun!\"";

        System.out.println(msg1 + msg2);

        int max = Integer.MAX_VALUE;

        System.out.println("The value of max is: " + max);
        max ++; // SIX CHARACTERS :)

        // THE UPPER BOUND OF THE INT TYPE OVERFLOWS BY 1, SO JAVA ASSIGNS THE LOWER BOUND OF THE INT TYPE
        System.out.println("The new value of max is: " + max);

    }
}
