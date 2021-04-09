package Test;

import Test.Currency;

public class Dollar extends Currency {

    // CONSTRUCTOR
    public Dollar () {
        symbol = "$";
        value = 1.0;
        // super("$", 1.0);
    }

    // METHODS
    public String toString () {
        return symbol + value;
    }

}
