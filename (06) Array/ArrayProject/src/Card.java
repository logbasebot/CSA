public class Card {

    // ATTRIBUTES
    private String suit;
    private String rank;
    private int value;

    // CONSTRUCTOR
    public Card (String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    // ACCESSORS
    public String getSuit () {
        return suit;
    }

    public String getRank () {
        return rank;
    }

    public int getValue () {
        return value;
    }

}