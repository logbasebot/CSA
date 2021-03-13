import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        // CREATE A NEW SCANNER OBJECT CALLED input.
        Scanner input = new Scanner(System.in);

        // CREATE AN ARRAYLIST OF PELLETS.
        ArrayList<Pellet> Pellets = new ArrayList<>();

        // ADD THREE MEMBERS TO THE PELLET ARRAYLIST
        // WITH THE FOLLOWING ATTRIBUTES:
        //    #0 - POSITION: 2,2   SPEED: 1,1
        //    #1 - POSITION: 3,3   SPEED: -1,1
        //    #2 - POSITION: 1,4   SPEED: 1,1
        Pellets.add(new Pellet(2,2,1,1));
        Pellets.add(new Pellet(3,3,-1,1));;
        Pellets.add(new Pellet(1,4,1,1));;

        // INFINITE LOOP!
        while (true) {

            // WRITE A FOR LOOP THAT RUNS FROM 0 THROUGH 9
            // USING AN ITERATOR CALLED y
            for (int y = 0; y < 9; y++) {

                // WRITE A FOR LOOP THAT RUNS FROM 0 THROUGH 9
                // USING AN ITERATOR CALLED x
                for (int x = 0; x < 9; x++) {

                    // CREATE AN INT CALLED pellet_id
                    // AND SET IT EQUAL TO -1
                    int pellet_id = -1;

                    // WRITE A FOR LOOP THAT RUNS FROM 0 THROUGH
                    // THE LAST INDEX OF THE PELLET ARRAYLIST, 
                    // USING AN ITERATOR CALLED i.
                    for (int i = 0; i < Pellets.size(); i++) {

                        // IF THE POSITION OF THE PELLET MATCHES
                        // x AND y, RECORD THE PELLET'S INDEX IN
                        // pellet_id.
                        if (Pellets.get(i).get_posX() == x && Pellets.get(i).get_posY() == y) {
                            pellet_id = i;
                        }
                    }

                    // IF pellet_id IS STILL -1, PRINT A DASH;
                    // OTHERWISE, PRINT pellet_id.
                    if (pellet_id == -1) {
                        System.out.print("-");
                    }
                    else {
                        System.out.print(pellet_id);
                    }
                }

                // PRINT A LINE BREAK!
                System.out.println();
            }

            // WRITE A FOR-LOOP AND CALL THE UPDATE METHOD
            // FOR EACH PELLET IN THE PELLET ARRAYLIST
            for (int i = 0; i < Pellets.size(); i++) {
                Pellets.get(i).Update();
            }

            // WAIT FOR THE USER TO HOLD DOWN THE ENTER KEY
            input.nextLine();
        }
    }
}