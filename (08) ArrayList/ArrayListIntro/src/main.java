import java.util.ArrayList;

public class main {
    public static void main (String[] args) {

        // DECLARATION - DO NOT SPECIFY SIZE
        ArrayList<String> restaurants = new ArrayList<String>();

        // add() METHOD
        restaurants.add("McDonald's"); // 0
                                       // 1
        restaurants.add("Checkers");   // 2
        restaurants.add("Qdoba");      // 3
        restaurants.add("Wendy's");    // 4

        // size() & get() METHODS
        // BASIC LOOP TRAVERSAL

        for (int i = 0; i < restaurants.size(); i++) {
            System.out.println(restaurants.get(i) );
        }

        // set() METHOD - ANALOGOUS TO restaurants[3] = "Chipotle"
        restaurants.set(3, "Chipotle");

        // add() METHOD - AT INDEX
        restaurants.add(1, "Burger King");

        // remove() METHOD
        restaurants.remove(4);


        System.out.println("-------------");


        // ENHANCED LOOP TRAVERSAL
        for (String r : restaurants) {
            System.out.println(r);
        }

    }
}