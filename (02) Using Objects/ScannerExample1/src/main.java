import java.util.Scanner;

public class main {

    public static void main (String[] args) {

        // CREATE SCANNER OBJECT
        Scanner s1;
        s1 = new Scanner(System.in);


        // STORE STRING WITH SCANNER
        System.out.println("What is your name? ");
        String username;
        username = s1.nextLine();

        System.out.println("Hello, " + username + "!");


        // STORE INT WITH SCANNER
        System.out.println("What is your age? ");
        int age;
        age = s1.nextInt();

        System.out.println("You can legally become president in " + (35 - age) + " years.");


        // STORE DOUBLE WITH SCANNER
        System.out.println("How do you feel today [0-100]? ");
        double mood;
        mood = s1.nextDouble();

        System.out.println("Future President " + username + ", operating at " + mood + "%!");


    }

}