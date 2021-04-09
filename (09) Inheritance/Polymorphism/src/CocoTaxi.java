public class CocoTaxi extends Vehicle {

    // ATTRIBUTES
    boolean started;

    // CONSTRUCTOR
    public CocoTaxi () {
        weight = 600.0;
        wheels = true;
        num_wheels = 3;
        fuel = 12.0;
    }

    // METHODS
    public void TurnOn () {
        started = true;
    }

    // OVERRIDDEN METHOD
    public void Travel (String destination) {
        if (started) {
            // USE THE SUPERCLASS METHOD
            super.Travel(destination);
        }
        else {
            System.out.println("Must turn on the engine!");
        }
    }

}
