public class Chicken {

    // STATIC ATTRIBUTES
    private static int count;


    // ATTRIBUTES
    private boolean female;
    private double weight;
    private String feather_style;
    private int id;

    // CONSTRUCTORS
    public Chicken () {
        female = true;
        weight = 1.7;
        feather_style = "black";

        id = count++;
    }

    public Chicken (boolean female, double weight, String feather_style) {
        this.female = female;
        this.weight = weight;
        this.feather_style = feather_style;

        id = count++;
    }

    // ACCESSORS
    public int getID () {
        return id;
    }

    public static int getCount () {
        return count;
    }

}
