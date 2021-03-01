import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        boolean on = true;

        while (on) {
            // INSTANTIATED INSIDE THE LOOP INTENTIONALLY, REMOVES THE NEED TO CLEAR IF USER STARTS AGAIN
            ArrayList<String> food_items = new ArrayList<>();
            ArrayList<String> ingredients = new ArrayList<>();

            // ADD ITEMS!
            food_items.add("Spaghetti Noodles");
            food_items.add("Bagels");
            food_items.add("Tortillas");

            food_items.add("Cream Cheese");
            food_items.add("Parmesan Cheese");
            food_items.add("Hot Sauce");

            food_items.add("Breaded Chicken");
            food_items.add("Smoked Salmon");
            food_items.add("Spaghetti Sauce");


            // OBTAIN INGREDIENTS!
            for (int i = 0; i < 3; i++) {

                for (int j = food_items.size() - 1; j >= 0; j--) {
                    System.out.println("#" + j + ": " + food_items.get(j));
                }

                int n;
                do {
                    System.out.println("Choose an item: ");
                    n = input.nextInt();
                } while (n > food_items.size() || n < 0);

                ingredients.add(food_items.get(n));
                food_items.remove(n);

            }

            // MAKING MEALS!
            if (ingredients.contains("Spaghetti Noodles")
                    && ingredients.contains("Parmesan Cheese")
                    && ingredients.contains("Spaghetti Sauce")) {
                System.out.println("Enjoy your spaghetti!");
            }

            else if (ingredients.contains("Bagels")
                    && ingredients.contains("Cream Cheese")
                    && ingredients.contains("Smoked Salmon")) {
                System.out.println("Enjoy your lox and bagels!");
            }

            else if (ingredients.contains("Tortillas")
                    && ingredients.contains("Breaded Chicken")
                    && ingredients.contains("Hot Sauce")) {
                System.out.println("Enjoy your chicken wrap!");
            }

            else {
                System.out.println("Uh, good luck with that!");
            }

            // TRY AGAIN?
            System.out.println("Try again? (true/false)");
            boolean again = input.nextBoolean();

            if (again) {
                System.out.println("Running again!");
            }

            else {
                System.out.println("Goodbye!");
                on = false;
            }

        }




    }
}
