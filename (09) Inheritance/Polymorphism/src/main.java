public class main {

    public static void main (String[] args) {

        Vehicle v1 = new Unicycle();
        v1.Travel("Winter Park");
        System.out.println(v1);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Unicycle();
        vehicles[1] = new CocoTaxi();
        vehicles[2] = new Ultralight();

        for (int i = 0; i < vehicles.length; i++) {
            PrepForTravel(vehicles[i]);
            vehicles[i].Travel("Miami");
        }

    }

    public static void PrepForTravel (Vehicle v) {

        if (v.getClass().toString().equals("class CocoTaxi")) {
            ((CocoTaxi)v).TurnOn();
        }
        else if (v.getClass().toString().equals("class Ultralight")) {
            ((Ultralight)v).Takeoff();
        }
        else {
            // UNICYCLE
        }

    }

}
