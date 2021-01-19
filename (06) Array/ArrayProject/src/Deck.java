public class Deck {

    // ATTRIBUTES
    private Card[] card = new Card[52];
    String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] rank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
                    "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    // CONSTRUCTOR
    public Deck () {
        int value = 1; // VALUE OF THE CARD STARTS AT 1
        int track = 0; // ARRAY INDEX STARTS AT 0

        // FILL WITH CURRENT SUIT, RANK MOVES UP, COUNT RESETS TO 1 AT THE END OF A SUIT
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                card[track] = new Card(suit[i], rank[j], value);
                value++;
                track++;
            }
            value -= 13;
        }

    }

    // METHODS
    public Card Draw () {
        int rand = (int) (Math.random() * 52); // GET A RANDOM CARD
        Card current = card[rand]; // SAVE THE INFO FOR THIS CARD
        card[rand] = null; // WE NO LONGER HAVE THIS CARD IN OUR DECK!

        return current; // GIVE THE CARD WE JUST REMOVED
    }

    // DEBUG METHOD
    public void Identify () {
        for (int i = 0; i < card.length; i++) {
            System.out.println("Suit: " + card[i].getSuit());
            System.out.println("Rank: " + card[i].getRank());
            System.out.println("Value: " + card[i].getValue());
        }
    }

}