public class Employee {

    // ATTRIBUTES
    protected String name;
    protected int id;
    protected double hourly_rate;

    // CONSTRUCTORS
    public Employee () {
        name = "Unknown";
        id = -1;
        setHourlyRate(8.46);
    }

    public Employee (String name, int id) {
        this.name = name;
        this.id = id;
        setHourlyRate(8.46);
    }

    // METHODS
    public String Category () {
        return "Unassigned";
    }

    public void Describe () {
        System.out.println("Name:" + getName() + "\nID: " + getID() +
                            "\nHourly Rate:" + getHourlyRate() );
    }

    // ACCESSORS
    public String getName () {
        return name;
    }

    public int getID () {
        return id;
    }

    public double getHourlyRate () {
        return hourly_rate;
    }

    // MUTATORS
    public void setHourlyRate (double hourly_rate) {
        if (hourly_rate < 8.46) {
            this.hourly_rate = 8.46;
        }
        this.hourly_rate = hourly_rate;
    }

}
