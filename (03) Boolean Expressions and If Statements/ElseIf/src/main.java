
public class main {

    public static void main (String[] args) {

        double grade = 70.0;

        // (0) IF CONDITION 0 IS TRUE, EXECUTE CODE
        if (grade >= 90.0) {
            System.out.println("You got an A!");
        }

        // (1) IF CONDITION 0 IS FALSE, EXECUTE THIS CODE
        else if (grade >= 80.0) {
            System.out.println("You got a B!");
        }

        // (2) IF CONDITION 1 IS FALSE, EXECUTE THIS CODE
        else if (grade >= 70.0) {
            System.out.println("You got a C!");
        }
        else if (grade >= 60.0) {
            System.out.println("You got a D!");
        }
        else {
            System.out.println("You got an F!");
        }

    }

}
