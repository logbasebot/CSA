

public class main {
    public static void main (String[] args) {

        String str = "Computer Science A";

        // AESTHETIC TEXT
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

        // SPACE...
        System.out.println();

        int n = 0;
        // KAREN TEXT
        while (n < str.length() ) {
            if (n % 2 == 0) {
                System.out.print(str.toUpperCase().charAt(n) );
            }
            else {
                System.out.print(str.toLowerCase().charAt(n));
            }
            n++;
        }

        // SPACE...
        System.out.println();

        // BACKWARDS
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) );
        }

    }
}