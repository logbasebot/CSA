import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String str = input.nextLine().toLowerCase();

        System.out.println("Now enter a character: ");
        String ch = input.next().toLowerCase();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch.charAt(0)) {
                count++;
            }
        }

        System.out.println("Character " + ch + " appears " + count + " times!");

    }
}
