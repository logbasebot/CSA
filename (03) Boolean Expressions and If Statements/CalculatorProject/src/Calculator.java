public class Calculator {
    static int count = 0;

    public double add (double a, double b) {
        count++;
        return a + b;
    }
    public double subtract (double a, double b) {
        count++;
        return a - b;
    }
    public double multiply (double a, double b) {
        count++;
        return a * b;
    }
    public double divide (double a, double b) {
        count++;
        return a / b;
    }
    public int getCount () {
        return count;
    }
    public void reset () {

        count = 0;
    }
}
