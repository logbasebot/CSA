

public class main {
    public static void main (String[] args) {

        System.out.println(".----.----.----.----.----");

        // NESTED LOOPS
        for (int i = 0; i < 5; i++) {
            System.out.print(".");

            for (int j = 0; j < 4; j++) {
                System.out.print("-"); // PRINTED 5 * 4 = 20 TIMES (4 EACH TIME)

                for (int k = 0; k < 10; k++) {
                    System.out.print("|"); // PRINTED 5 * 4 * 10 = 200 TIMES (10 EACH TIME)
                }

            }

        }


    }
}
