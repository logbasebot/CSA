import java.util.Scanner;

public class main {

    public static void main (String[] args) {

        // MAIN DECK
        Deck deck1 = new Deck();

        // USER INPUT
        Scanner input = new Scanner(System.in);

        // deck1.Identify(); VERIFY THE CORRECT ORDER

        int hand_size;

        // DON'T BE A FOOL
        do {
            System.out.println("How many cards do you want to draw? [1-52]");
            hand_size = input.nextInt();
        }
        while (hand_size > 52 || hand_size < 1);


        // OUR HAND, A SUBSET OF MAIN DECK
        Card[] hand = new Card[hand_size];

        // KEEP TRACK OF CURRENT CARD AND VALUE
        Card current;
        int value = 0;

        // DRAW THE OTHER CARDS
        for (int i = 0; i < hand.length; i++) {
            do {
                current = deck1.Draw();
                hand[i] = current;
            }
            while (current == null); // IN THE CASE THAT THIS CARD IS NO LONGER IN THE MAIN DECK
            value += hand[i].getValue(); // KEEP TRACK OF OUR TOTAL VALUE
        }

        // PRINT OUR HAND
        System.out.println("Your cards are: ");

        for (int i = 0; i < hand.length; i++) {
            System.out.println(hand[i].getRank() + " of " + hand[i].getSuit());
        }

        System.out.println("Hand value: " + value);

    }

}