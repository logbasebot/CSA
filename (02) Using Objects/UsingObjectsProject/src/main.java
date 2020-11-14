import java.util.Scanner;

//// Name: Santiago Christ
//// Period: 1
//// Estimated Points: 40
//// SANTIAGO HERE, INTERESTING TO NOTE THAT THE METHOD DOES NOT WORK WITH SINGLE WORDS, IT EXPECTS A SPACE.
//// ** Submit your completed code to the appropriate dropbox on eCampus. **

public class main {
    public static void main(String[] args)
    {
        // CREATE A SCANNER TO ACCEPT USER INPUT
        Scanner input;
        input = new Scanner(System.in);

        // STORE THE USER'S INPUT IN A STRING CALLED MSG
        String msg;

        // MAX AND MIN WILL STORE THE LENGTH OF THE LONGEST AND SHORTEST STRINGS
        int max = 0;
        int min = Integer.MAX_VALUE;

        // COUNT KEEPS TRACK OF THE NUMBER OF STRINGS THAT HAVE BEEN ENTERED
        int count = 0;

        // TOTAL KEEPS TRACK OF THE TOTAL LENGTH OF ALL STRINGS COMBINED
        int total = 0;

        // AVERAGE KEEPS TRACK OF THE AVERAGE LENGTH OF ALL STRINGS
        double average;

        // LOOP INDEFINITELY
        while (true)
        {
            // PROMPT THE USER FOR A RESPONSE
            System.out.print("Enter a sentence: ");
            msg = input.nextLine();

            // (2 pts.) INCREMENT COUNT BY 1
            count++;

            // (2 pts.) PRINT THE ENTIRE STRING
            System.out.println("\nYou inputted: " + msg);

            // (5 pts.) GET THE INDEX OF THE FIRST SPACE IN THE SENTENCE
            int i1 = msg.indexOf(" ");

            // (5 pts.) PRINT THE FIRST WORD OF THE SENTENCE
            System.out.println("First Word: " + msg.substring(0, i1) );;

            // (4 pts.) DETERMINE THE LENGTH OF THE STRING AND PRINT IT
            System.out.println("String length: " + msg.length() );

            // (4 pts.) ADD THE LENGTH TO TOTAL AND PRINT IT
            total += msg.length();
            System.out.println("Total length: " + total);

            // (4 pts.) CALCULATE A NEW AVERAGE LENGTH
            average = (total/count);

            // (4 pts.) ROUND THE AVERAGE LENGTH AND PRINT IT
            average = (int)average;
            System.out.println("Average length: " + average);

            // (5 pts.) UPDATE THE LENGTH OF THE SHORTEST AND LONGEST STRINGS MAX MIN
            max = Math.max(msg.length(), max);
            min = Math.min(msg.length(), min);

            // (3 pts.) PRINT THE LENGTH OF THE SHORTEST AND LONGEST STRINGS
            System.out.println("The shortest sentence: " + min + "\nThe longest sentence: " + max + '\n');

        }
    }
}

//// (2 pts.) PROPER OUTPUT
//
// Enter a sentence: Every next level of your life will demand a different you.
// You entered: Every next level of your life will demand a different you.
// The first word: Every
// The length of the sentence: 58
// Total characters in all sentences so far: 58
// Average characters in all sentences so far: 58
// The shortest sentence: 58
// The longest sentence: 58
//
// Enter a sentence: Be yourself; everyone else is already taken.
// You entered: Be yourself; everyone else is already taken.
// The first word: Be
// The length of the sentence: 44
// Total characters in all sentences so far: 102
// Average characters in all sentences so far: 51
// The shortest sentence: 44
// The longest sentence: 58
//