import java.sql.SQLOutput;

public class main {

    public static void main (String[] args) {
        String str1;
        str1 = new String("Go Noles!");

        // charAt(index)
        char ch1 = str1.charAt(0); // RETURN CHARACTER AT INDEX 0 (FIRST CHARACTER)
        System.out.println(ch1);

        char ch6 = str1.charAt(6); // RETURN CHARACTER AT INDEX 6 (SEVENTH CHARACTER)
        System.out.println(ch6);

        //char ch9 = str1.charAt(9);  RETURN CHARACTER AT INDEX 9 (TENTH CHARACTER DNE, ERROR)
        //System.out.println(ch9);


        // length()
        int length;
        length = str1.length();
        System.out.println(length); // RETURNS LENGTH n, [0, n - 1]


        // substring(beginIndex, endIndex)
        String first_half;
        first_half = str1.substring(0, length/2 + 1);
        System.out.println(first_half);

        String second_half;
        second_half = str1.substring(length/2 + 1, length); // NOTE THAT endIndex IS NOT NECESSARY HERE
        System.out.println(second_half);


        // STRING CONCATENATION
        String full_string;
        full_string = str1 + " - Dr. Rodriguez";
        System.out.println(full_string);

        str1 += " - Dr. Rodriguez"; // ONLY COMPOUND ASSIGNMENT OPERATOR FOR STRINGS


        // equals() RETURNS TRUE/FALSE, BOOLEAN
        String msg1 = "abcd";
        String msg2 = "efgh";

        boolean same;
        same = msg1.equals(msg2);
        System.out.println(same);

        // compareTo(string) RETURNS INT
        int difference;
        difference = msg1.compareTo(msg2); // NEGATIVE NUMBER, -4 CHARACTERS (BEHIND) ON EACH LETTER
        System.out.println(difference);

        difference = msg2.compareTo(msg1); // POSITIVE NUMBER, 4 CHARACTERS (AHEAD) ON EACH LETTER
        System.out.println(difference);


        System.out.println(ch1); // PRINTS G
        ch1 += 1; // ADD 1 TO UNICODE VALUE, BECOMES H
        System.out.println(ch1); // PRINTS H

        stringMaster("Santiago", "Christ");
    }

    public static boolean stringMaster (String str1, String str2) {
        System.out.println("First String: " + str1);
        System.out.println("First String Length: " + str1.length() );
        System.out.println("First String Initial Character: " + str1.charAt(0) );
        System.out.println("First String Final Character: " + str1.charAt(str1.length() - 1) );

        System.out.println("Second String: " + str2);
        System.out.println("Second String Length: " + str2.length() );
        System.out.println("Second String Initial Character: " + str2.charAt(0) );
        System.out.println("Second String Final Character: " + str2.charAt(str2.length() - 1) );

        System.out.println("\n Are Both Strings Equal? " + str1.equals(str2) );
        return str1.equals(str2);
    }

}
