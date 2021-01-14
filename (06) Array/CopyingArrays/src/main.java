public class main {
    public static void main (String[] args) {

        /* ADD ELEMENT */

        int[] ages = {17, 18, 15, 15, 16, 21};

        // PRINT ORIGINAL ARRAY
        for (int age : ages) {
            System.out.println(age);
        }

        System.out.println("--------------");

        // TEMP ARRAY HAS SPACE FOR 1 MORE ELEMENT
        int[] temp_ages = new int[ages.length + 1];

        // AGES.LENGTH - COPIES ONLY OLD ELEMENTS
        for (int i = 0; i < ages.length; i++) {
            temp_ages[i] = ages[i];
        }
        temp_ages[temp_ages.length - 1] = 16;

        // COPY ARRAY
        ages = temp_ages;

        // PRINT COPIED ARRAY
        for (int age : ages) {
            System.out.println(age);
        }

        System.out.println("--------------");


        /* REMOVE ELEMENT */

        int[] temp_ages2 = new int[ages.length - 1];
        int copy_to = 0;

        for (int i = 0; i < ages.length; i++) {
            // COPY EVERY ELEMENT EXCEPT THE 6TH [5] ONE
            if (i != 5) {
                temp_ages2[copy_to] = ages[i];
                copy_to++;
            }
        }

        // COPY ARRAY
        ages = temp_ages2;

        // PRINT COPIED ARRAY
        for (int age : ages) {
            System.out.println(age);
        }

        System.out.println("--------------");
    }
}