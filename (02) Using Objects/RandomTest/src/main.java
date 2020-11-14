public class main {

    public static void main (String[] args) {

        double rand;
        rand = Math.random();
        System.out.println("Original random: " + rand); // RANDOM DOUBLE, [0-1)

        double randTen;
        randTen = Math.random() * 10;
        System.out.println("Random multiplied by ten: " + randTen); // RANDOM DOUBLE, [0, 10)

        double rand_addOne;
        rand_addOne = Math.random() * 10;
        System.out.println("Random added by one: " + rand_addOne); // RANDOM DOUBLE [1, 2)

        int randCast;
        randCast = (int)rand_addOne;
        System.out.println("Random without decimal: " + randCast); // INTEGER CAST TO DOUBLE

        // SIMPLIFIED VERSION
        int randLast = (int)(Math.random() * 10.0 + 1.0);
        System.out.println("Last Random: " + randLast);

        // CHALLENGE: RAND [0, 100)
        int randHundred = (int)(Math.random() * 100.0);
        System.out.println("Random number [0, 100): " + randHundred);

        // CHALLENGE: RAND (20, 80)
        int randX = (int)(Math.random() * 60.0 + 20.0);
        System.out.println("Random number (20, 80): " + randX);
    }

}