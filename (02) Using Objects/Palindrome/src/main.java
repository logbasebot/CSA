import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        // INITIATE SCANNER
        Scanner s1 = new Scanner(System.in);

        // PROMPT MESSAGE, STORE WITH SCANNER
        System.out.println("Enter a message! ");
        
        String message;
        message = s1.nextLine();

        // CREATE StringReverser OBJECT, USE CUSTOM CONSTRUCTOR
        StringReverser sr1;
        sr1 = new StringReverser(message);

        // OUTPUT RESULTS
        System.out.println("ORIGINAL: " + message);
        System.out.println("REVERSED: " + sr1.Reverse(message)); // REVERSE METHOD FROM StringReverser
        System.out.println("Same Message? " + message.equals(sr1.Reverse(message))); // equals() METHOD

    }
}