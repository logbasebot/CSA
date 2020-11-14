

public class main {

    public static void main (String[] args) {
        // IF YOU'RE HAPPY AND YOU KNOW IT, CLAP YOUR HANDS!
        boolean isHappy = true;
        boolean awareHappy = true;
        boolean desireExpression = true;

        // AND &&
        // ALL VARIABLES MUST BE TRUE
        if ( (isHappy && awareHappy) && desireExpression) {
            Clap();
        }

        // OR ||
        // ONLY ONE VARIABLE MUST BE TRUE
        if (isHappy || desireExpression) {
            Clap();
        }

        // LOGIC CHART || OR
        //                    p
        //              true    false
        // q    true    TRUE    TRUE
        //      false   TRUE    FALSE

        // LOGIC CHART && AND
        //                    p
        //              true    false
        // q    true    TRUE    FALSE
        //      false   FALSE   FALSE

        int age = 17;
        double examScore = 72.5;

        if (age >= 16 && examScore >= 70.0) {
            System.out.println("You can get a driver's license!");
        }

        boolean paidFee = false;
        boolean goodStudent = true;

        if (paidFee || goodStudent) {
            System.out.println("You can get a driver's license!");
        }

        // NEGATION !

        boolean isHot = true;

        if (!isHot) {
            System.out.println("It is safe to eat the soup!");
        }

        int a = 5;
        int b = 7;
        boolean likesCoffee = true;

        //   !(false) || !true
        //   true     || false
        if ( !(a > b) || (!likesCoffee) ) {
            // CODE
        }

    }

    public static void Clap() {
        System.out.println("CLAP!");
    }

}