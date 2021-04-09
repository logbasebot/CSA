package Test;

public class Currency {

    // ATTRIBUTES - protected KEYWORD PREVENTS ACCESS IN MAIN
    protected String symbol;
    protected double value;

    // CONSTRUCTORS
    public Currency () {

    }

    public Currency (String symbol, double value) {
        this.symbol = symbol;
        this.value = value;
    }

    // ACCESSORS
    public String getSymbol () {
        return symbol;
    }

    public double getValue () {
        return value;
    }


}
