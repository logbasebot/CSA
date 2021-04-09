public class Ultralight extends Vehicle {

    // ATTRIBUTES
    boolean airborne = false;

    // CONSTRUCTOR
    public Ultralight () {
        weight = 250.0;
        wheels = true;
        num_wheels = 3;
        fuel = 5.0;
    }

    public void Takeoff () {
        airborne = true;
    }

    public void Travel (String destination) {
        if (airborne) {
            super.Travel(destination);
        }
        else {
            System.out.println("Must be airborne!");
        }
    }

}
