import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main (String[] args) {

        ArrayList<String> fl_metro = new ArrayList<>();

        fl_metro.add("Miami");
        fl_metro.add("Jacksonville");
        fl_metro.add("Orlando");
        fl_metro.add("Tampa");
        fl_metro.add("Gainesville");

        // UNSORTED
        System.out.println(fl_metro);

        // A-Z SORTED (LEXICOGRAPHICALLY)
        Collections.sort(fl_metro);
        System.out.println(fl_metro);

        // Z-A SORTED (REVERSE LEXICOGRAPHICALLY)
        Collections.sort(fl_metro, Collections.reverseOrder());
        System.out.println(fl_metro);

        // toArray() METHOD
        String[] final_metro = new String[fl_metro.size()];
        fl_metro.toArray(final_metro);

        for (String str : final_metro) {
            System.out.println(str);
        }

        // clone() METHOD
        ArrayList<String> backup = new ArrayList<>();
        backup = (ArrayList<String>) fl_metro.clone();
        System.out.println(backup);

        // contains() METHOD
        boolean contains = fl_metro.contains("Fort Myers");
        System.out.println(contains);

        // indexOf() METHOD
        int orlando_index = fl_metro.indexOf("Orlando");
        System.out.println(orlando_index);


    }
}