import java.util.Scanner;

public class main {
    public static void main (String[] args) {

        // INITIALIZE A SCANNER DATA TYPE. THIS WILL STORE USER INPUT.
        Scanner input;
        input = new Scanner(System.in);

        // PROMPT USER TO ENTER PLAIN TEXT, SCAN THAT LINE FOR STRING ('nextLine() method')
        System.out.println("Plain Text: ");
        String plain_text;
        plain_text = input.nextLine();

        // PROMPT USER TO ENTER A SHIFT, SCAN THAT LINE FOR INT ('nextInt() method')
        System.out.println("Shift: ");
        int shift;
        shift = input.nextInt();

        // THE CIPHER TEXT IS INITIALIZED EMPTY, AS THE FOR LOOP WILL TAKE CARE OF THE REST
        String cipher_text = "";

        /* THIS FOR LOOP SHIFTS EACH CHARACTER IN 'plain_text' BY THE AMOUNT 'shift',
           THEN STORES IT IN THE STRING 'cipher_text'. THIS IS A CAESAR CIPHER.
         */
        for (int i = 0; i < plain_text.length(); i++) {
            char letter;
            letter = plain_text.charAt(i);
            letter += shift;
            cipher_text += letter;
        }

        // PRINT OUT THE CAESAR CIPHER TEXT
        System.out.println("Cipher Text: ");
        System.out.println(cipher_text);
    }
}
