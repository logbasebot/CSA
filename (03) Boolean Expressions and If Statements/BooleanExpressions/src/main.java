import java.util.Scanner;

public class main {

    public static void main (String[] args) {

        /*
        int age1 = 18;
        int age2 = (12 + 5);

        boolean ableToVote;

        ableToVote = (age1 >= 18); // RELATIONAL OPERATOR, RETURNS TRUE/FALSE
        System.out.println("Able to vote? " + ableToVote);

        ableToVote = (age2 >= 18);
        System.out.println("Able to vote? " + ableToVote);


        // SIX RELATIONAL OPERATORS
        // == EQUAL TO
        // != NOT EQUAL TO
        // > GREATER THAN
        // < LESS THAN
        // >= GREATER THAN OR EQUAL TO
        // < LESS THAN OR EQUAL TO


        int p = 12;
        int q = 6;

        System.out.println(p == q); // FALSE
        System.out.println(p != q); // TRUE
        System.out.println(p > q); // TRUE
        System.out.println(p < q); // FALSE
        System.out.println(p >= q); // TRUE
        System.out.println(p <= q); // FALSE

        p = 18;
        q = 18;

        System.out.println(p == q); // TRUE
        System.out.println(p != q); // FALSE
        System.out.println(p > q); // FALSE
        System.out.println(p < q); // FALSE
        System.out.println(p >= q); // TRUE
        System.out.println(p <= q); // TRUE

        boolean likesCoffee;
        likesCoffee = true;

        if (likesCoffee) {
            System.out.println("I like coffee!");
        }
        likesCoffee = false;
        */

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");

        int age = input.nextInt();

        if (age >= 15) {
            System.out.println("You are old enough to get your learner's permit!");
        }
        else {
            System.out.println("You are NOT old enough to get your learner's permit!");
        }

        if (age >= 16) {
            System.out.println("You are old enough to get your driver's license!");
        }
        else {
            System.out.println("You are NOT old enough to get your driver's license!");
        }

        if (age >= 18) {
            System.out.println("You are old enough to vote!");
        }
        else {
            System.out.println("You are NOT old enough to vote!");
        }

        if (age >= 21) {
            System.out.println("You are old enough to purchase alcohol!");
        }
        else {
            System.out.println("You are NOT old enough to purchase alcohol!");
        }

        if (age >= 35) {
            System.out.println("You are old enough to become the president!");
        }
        else {
            System.out.println("You are NOT old enough to become the president!");
        }
        System.out.println("-------------------------");
        // RIDE AT DISNEY, MUST BE AT LEAST 5 FT TALL
        // ASK USER THEIR HEIGHT AND STORE IT AS A DOUBLE
        // TELL THE USER WHETHER OR NOT THEY ARE TALL ENOUGH

        System.out.println("How tall are you?");

        double height = input.nextDouble();

        if (height >= 5.0) {
            System.out.println("You are tall enough for the ride!");
        }
        else {
            System.out.println("You are NOT tall enough for the ride!");
        }

    }
}
