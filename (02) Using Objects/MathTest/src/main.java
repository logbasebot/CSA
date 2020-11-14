public class main {

    public static void main (String[] args) {
        int randHundred = (int)(Math.random() * 201.0 - 100.0); // RAND (-100, 100)

        Analysis(randHundred);
    }

    public static void Analysis (double a) {
        System.out.println("Value: " + a + "\nAbsolute Value: " + Math.abs(a)
                + "\nSquare Root: " + Math.sqrt(a) + "\nRaised to the 2nd: " + Math.pow(a, 2)
                + "\nEven number: " + (a%2 == 0) );
    }
}