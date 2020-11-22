public class main {
    public static void main (String[] args) {

        boolean success = false;
        int count = 0;

        while (!success) {

           String gobble = "";

           for (int i = 0; i < 6; i++) {


               int random = (int)(Math.random() * 5);

               if (random == 0) {
                   gobble += "G";
               }
               else if (random == 1) {
                   gobble += "O";
               }
               else if (random == 2) {
                   gobble += "B";
               }
               else if (random == 3) {
                   gobble += "L";
               }
               else {
                   gobble += "E";
               }
           }

            count++;

            System.out.println(count + "\t\t" + gobble);


            if (gobble.equals("GOBBLE") ) {
                success = true;
                System.out.println("It took " + count + " tries!");
            }

        }

    }
}
