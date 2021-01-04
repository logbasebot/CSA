

public class main {
    public static void main (String[] args) {
        Chicken chicken1 = new Chicken(); // DEFAULT CONSTRUCTOR USED
        Chicken chicken2 = new Chicken(false, 2.0, "brown"); // CUSTOM CONSTRUCTOR USED

        System.out.println("Chicken #" + chicken1.getID() + " reporting for duty!");
        System.out.println("Chicken #" + chicken2.getID() + " reporting for duty!");

        System.out.println("There are " + Chicken.getCount() + " chickens in total.");
    }
}
