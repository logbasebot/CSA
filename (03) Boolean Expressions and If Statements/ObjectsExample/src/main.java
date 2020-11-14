import java.util.Scanner;

public class main {

    public static void main (String[] args) {
    /*
        int countChicken = 10;
        String welcome = "Hello, World!";

        String name; // OBJECT DEFAULT VALUE IS NULL
        name = new String("Santiago Christ"); // INSTANCE OF STRING CLASS
        name.length();

        Scanner input;
        input = new Scanner(System.in); // INSTANCE OF SCANNER CLASS

        System.out.println(input);
    */
        Vertex v1; // DEFAULT TO NULL
        v1 = new Vertex(); // CONSTRUCTOR METHOD (NO LONGER NULL)
        v1.Print();
        v1.X = 10.0;
        v1.Y = 20.0;
        v1.Z = 25.5;
        v1.Print();

        Vertex v2; // CAME FROM SAME CLASS, DIFFERENT OBJECT
        v2 = new Vertex();
        v2.X = 12.34;
        v2.Y = 56.78;
        v2.Z = 100.00;
        v2.Print(); // DIFFERENT COORDINATES

        Vertex v3;
        v3 = new Vertex(1.1, 2.2, 3.3);
        v3.Print();

        Shout("hello, world!");
        Shout("fus ro dah");
        Shout("picture day");
        Shout("get stick bugged");

        Add(12, 34);
        Add(69, 420);

        int result1 = Add(45,65);
        System.out.println(result1);

        Multiply(4, 3);
        Multiply(16, 9);

        int result2 = Multiply (14, 14);
        System.out.println(result2);
    }

    // VOID INDICATES THAT NO INFORMATION IS GIVEN BACK (ONLY PRINTED IN THIS CASE)
    public static void Shout(String str) {
        System.out.println(str.toUpperCase());
    }

    public static int Add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        return sum;
    }

    // CREATE A METHOD THAT MULTIPLIES TWO NUMBERS TOGETHER
    // TEST IN MAIN

    public static int Multiply(int num1, int num2) {
        int product = num1*num2;
        System.out.println(num1 + " * " + num2 + " = " + product);
        return product;
    }

}