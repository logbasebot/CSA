public class CashDrawer {

    // ATTRIBUTES
    private double money;
    private int times_deposited;
    private int times_withdrawn;
    private String color;
    private String password;

    // CONSTRUCTOR
    public CashDrawer () {
        money = 0;
        color = "Gray";
    }

    // CUSTOM CONSTRUCTOR
    public CashDrawer (double money, String color) {
        this.money = money;
        this.color = "Gray";
    }

    // INTEGRITY
    private double RestrictTransaction (double change) {
        // ASSUME GAS STATION, NO ITEM IS MORE THAN $100
        if (change > 100) change = 100;

        return money += change;
    }

    // INTEGRITY
    private String RestrictPassword (String pass) {
        if (pass.length() > 10) pass = pass.substring(0, 11);
        return pass;
    }

    // ACCESSOR
    public double getMoney () {
        return money;
    }

    // ACCESSOR
    public int getTimesDeposited () {
        return times_deposited;
    }

    // ACCESSOR
    public int getTimesWithdrawn () {
        return times_withdrawn;
    }

    // MUTATOR
    public void setColor (String color) {
        this.color = color;
    }

    // MUTATOR
    public void setPassword (String pass) {
        password = RestrictPassword(pass);
    }

    // METHOD
    private void DepositMoney (double money) {
        this.money += RestrictTransaction(money);
        times_deposited++;
    }

    // METHOD
    private void WithdrawMoney (double money) {
        this.money -= RestrictTransaction(money);
        times_withdrawn++;
    }
    
}
