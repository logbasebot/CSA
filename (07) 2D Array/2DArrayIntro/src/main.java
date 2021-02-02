import java.util.Arrays;

public class main {

    public static void main (String[] args) {

        // TIC TAC TOE BOARD - 3X3 2D ARRAY
        // STRING 2D ARRAY - USE X AND O

        String[][] tic = new String[3][3];

        tic[0][0] = "O";
        tic[0][1] = "X";
        tic[0][2] = "X";

        tic[1][0] = "X";
        tic[1][1] = "O";
        tic[1][2] = "O";

        tic[2][0] = "X";
        tic[2][1] = "O";
        tic[2][2] = "O";

        // PRINT R1C2 and R2C0
        // System.out.println(tic[1][2]);
        // System.out.println(tic[2][0]);

        // FOR LOOP, NOTICE LENGTH METHOD
        for (int row = 0; row < tic.length; row++) {
            for (int column = 0; column < tic[row].length; column++) {
                System.out.print(tic[row][column]);
            }
            System.out.println();
        }




        // ARRAY LITERAL METHOD
        String[][] tac = { {"O", "O", "X"}, {"X", "O", "O"}, {"X", "O", "O"}, };

        // FOR EACH STRING IN EACH COLUMN
        for (String[] row : tac) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

        System.out.println();
        // WE HAVE A MOVIE THEATER, SHOWING 5 FILMS
        // EACH FILM PLAYS 3 DIFFERENT TIMES IN A DAY
        // START TIMES ACROSS 15 MIN INTERVALS (8:00, 8:15, ...)
        // USE ARRAY LITERAL METHOD, CREATE A SCHEDULE
        // ENTER THE TIMES

        String[] titles = {"Spiderman", "Avengers", "Saw", "Despicable Me", "Bambi"};
        String[][] times = { {"1:00", "1:15", "1:30"}, {"1:45", "2:00", "2:15"}, {"2:30", "2:45", "3:00"},
                             {"3:15", "3:30", "3:45"}, {"4:00", "4:15", "4:30"} };

        for (int i = 0; i < titles.length; i++) {
            System.out.println(titles[i]);
            for (int j = 0; j < times[i].length; j++) {
                System.out.print(times[i][j] + "\t");
            }
            System.out.println();
        }


    }

}