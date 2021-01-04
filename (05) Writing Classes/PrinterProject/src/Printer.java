public class Printer {

    // STATIC ATTRIBUTES
    private static double max_ink;
    private static int max_paper;
    private static String manufacturer = "PrintCo";
    private static int count = 0;
    private static int min_sale_price = 30;

    // ATTRIBUTES
    private double ink = 10.0;
    private int paper = 10;
    private String model;
    private int completed_jobs = 0;
    private int id;
    private double sale_price;
    private boolean on = false;

    public Printer () {
        model = "Basic";
        sale_price = min_sale_price;
        id = count;
        count++;
    }

    public Printer (String model, double sale_price) {
        this.model = model;
        this.sale_price = sale_price;
        id = count;
        count++;
    }

    public void Print (String s) {

        if (!on || paper < Math.ceil(s.length() )*0.01 || ink <= 0.0) {
            System.out.print("Error #");

            if (!on) System.out.println("1: Turned off.");
            else if (paper < Math.ceil(s.length() )*0.01) System.out.println("2: Not enough paper.");
            else if (ink <= 0.0) System.out.println("3: Not enough ink.");

            System.out.println("------------------");
        }

        else {
            System.out.println(s);

            ink -= 0.01 * s.length();
            paper -= Math.ceil(s.length() )*0.01;
            completed_jobs++;

            System.out.println("==================");
            System.out.println("Success! \nRemaining Pages: " + paper + "\nRemaining ink: " + ink);
            System.out.println("==================");
        }

    }


    // ACCESSORS
    public static double getMax_ink() {
        return max_ink;
    }

    public static int getMax_paper() {
        return max_paper;
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static int getMin_sale_price() {
        return min_sale_price;
    }

    public double getInk() {
        return ink;
    }

    public int getPaper() {
        return paper;
    }

    public String getModel() {
        return model;
    }

    public int getCompleted_jobs() {
        return completed_jobs;
    }

    public int getId() {
        return id;
    }

    public double getSale_price() {
        return sale_price;
    }

    public boolean isOn() {
        return on;
    }

    // MUTATORS
    public void setInk(double ink) {
        this.ink = ink;
        if (this.ink >= 10.0) this.ink = 10.0;
    }

    public void setPaper(int paper) {
        this.paper = paper;
        if (this.paper >= 10) this.paper = 10;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

}