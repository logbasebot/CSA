import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {

        ArrayList<String> teams = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a team name:");
        String first = input.next();

        teams.add(first);

        while (true) {

            System.out.println("==OPTIONS==");
            System.out.println("1. ADD TEAM");
            System.out.println("2. VIEW TEAMS");
            System.out.println("Enter your choice: ");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Enter a team name: ");
                String team = input.next();

                System.out.println("Enter a position (0-" + teams.size() + "): ");

                int position = input.nextInt();
                teams.add(position, team);
            }
            if (choice == 2) {
                System.out.println("========");
                for (String s : teams) {
                    System.out.println("~" + s);
                }
                System.out.println("========");
            }


        }


    }
}