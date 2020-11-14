import java.util.Scanner;

public class main {

    public static void main (String[] args) {
        /*


        // BY MARKING THE CLASS AS STATIC, THE FIELD IS A MEMBER OF THE CLASS - NOT THE INDIV. OBJECTS

        A a1 = new A();
        a1.Foo(); // NON-STATIC METHOD


        A a2 = new A();
        A.Foo(); // STATIC METHOD CALLS THE CLASS DIRECTLY

        */


        // Math m1 = new Math(); // MUST BE CALLED STATICALLY

        int position;
        position = -12;
        System.out.println("Distance from 0: " + Math.abs(position) ); // ABS, ABSOLUTE VALUE

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int num1 = s1.nextInt();

        System.out.println("Enter the second integer: ");
        int num2 = s1.nextInt();

        System.out.println(Math.max(num1, num2) + " is bigger!"); // MAX, TAKE BIGGEST VALUE
        System.out.println(Math.min(num1, num2) + " is smaller!"); // MIN, TAKE SMALLEST VALUE

        System.out.println("The square root of 5: " + Math.sqrt(5) );
        System.out.println("The square root of 4: " + Math.sqrt(4) );
        System.out.println("The square root of 3: " + Math.sqrt(3) );

        System.out.println("Enter the base: ");
        int base = s1.nextInt();

        System.out.println("Enter the exponent: ");
        int exp = s1.nextInt();

        System.out.println(base + " to the" + exp + " is: " + Math.pow(base,exp) ); // POW, BASE RAISED TO EXPONENT
    }

}