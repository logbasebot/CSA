import java.util.ArrayList;

public class main {
    public static void main (String[] args) {

        // ARRAYLIST - STRING
        // ArrayList<String> a = new ArrayList<String>();

        // ARRAYLIST - NO TYPE
        ArrayList stuff = new ArrayList();

        stuff.add("Hello, World"); // STRING ADDED
        stuff.add(new Integer(10)); // INTEGER ADDED
        stuff.add(new Double(12.0)); // DOUBLE ADDED


        /* DO NOT WORK SINCE ARRAYLIST'S TYPE HAS NOT BEEN DECLARED

        stuff.get(0).toUpperCase();
        int n = stuff.get(1) * 2;

        */

        ArrayList<String> items = new ArrayList<String>();

        items.add("Bagel");    // 0
        items.add("Orange");   // 1
        items.add("Coffee");   // 2
        items.add("Cereal");   // 3
        items.add("Eggs");     // 4

        // STORES ORIGINAL INDEX, THEN REPLACES
        String replaced = items.set(2, "Milk");
        String removed = items.remove(1);

        for (String s : items) {
            System.out.println(s);
        }

        System.out.println("Replaced String: " + replaced);
        System.out.println("Removed String: " + removed);

        // IT IS POSSIBLE TO PRINT THE ARRAY, UNLIKE NORMAL STRINGS
        System.out.println(items);

    }
}
