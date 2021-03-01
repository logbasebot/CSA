import java.util.ArrayList;

public class main {
    public static void main (String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("1993 Ford Mustang LX");
        cars.add("2018 Ford F150");
        cars.add("1993 Ford Mustang LX");
        cars.add("1993 Ford Mustang LX");
        cars.add("1993 Ford Mustang LX");
        cars.add("2018 Toyota Camry SE");
        cars.add("1993 Ford Mustang LX");
        cars.add("1993 Ford Mustang LX");
        cars.add("1993 Ford Mustang LX");

        // CONCURRENT MODIFICATION EXCEPTION - BAD!
        for (String str : cars) {
            if (str.equals("1993 Ford Mustang LX")) {
                // cars.remove(str);
            }
        }

        // RISKY WAY
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).equals("1993 Ford Mustang LX")) {
                // cars.remove(i);
                // i--;
            }
        }

        // SAFE WAY
        for (int i = cars.size() - 1; i >= 0; i--) {
            if (cars.get(i).equals("1993 Ford Mustang LX")) {
                cars.remove(i);
            }
        }
        System.out.println(cars);

    }
}
