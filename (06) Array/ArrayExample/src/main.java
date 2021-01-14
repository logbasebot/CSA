public class main {
    public static void main (String[] args) {

        if (args.length > 0) {
            // COMMAND LINE ARGUMENTS TO CHECK
        }

        // TEMPORARY ARRAY, SIZE - 5, INDEX - [0,4]
        boolean[] checks = {true, false, false, true, false};
        System.out.println(checks[0]);
        System.out.println(checks[4]);
        // System.out.println(checks[-1]); OUT OF BOUNDS
        // System.out.println(checks[5]); OUT OF BOUNDS

        // STRING EXAMPLE - CHECKING FOR ITEMS
        String[] inventory = {"potion", "sword", "book", "wand", "axe"};
        boolean has_wand = false;

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].equals("wand")) {
                has_wand = true;
            }
        }
        System.out.println("The player has a wand: " + has_wand);

        // CHECK FOR DUPLICATES EXAMPLE
        int[] numbers = {1, 5, 7, 4, 5, 4, 6, 9, 10, 3};
        boolean has_duplicate = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    has_duplicate = true;
                }
            }
        }
        System.out.println("This array has a duplicate: " + has_duplicate);

        // MAX AND MIN VALUES OF ARRAY - METHOD 1
        int largest1 = Integer.MIN_VALUE;
        int smallest1 = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest1) {
                largest1 = numbers[i];
            }
            if (numbers[i] < smallest1) {
                smallest1 = numbers[i];
            }
        }
        System.out.println("Largest number: " + largest1);
        System.out.println("Smallest number: " + smallest1);

        // MAX AND MIN VALUES OF ARRAY - METHOD 2 (SLOWER)
        int largest2 = Integer.MIN_VALUE;
        int smallest2 = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            largest2 = Math.max(largest2, numbers[i]);
            smallest2 = Math.min(smallest2, numbers[i]);
        }
        System.out.println("Largest number: " + largest2);
        System.out.println("Smallest number: " + smallest2);

        // SUM OF TWO CONSECUTIVE NUMBERS
        for (int i = 0; i < numbers.length- 1; i++) {
            System.out.println(numbers[i] + numbers[i+1]);
        }

    }
}
