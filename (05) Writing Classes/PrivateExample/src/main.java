

public class main {

    public static void main (String[] args) {
        Elephant e = new Elephant(20, 10000);

        System.out.println("The elephant's age is " + e.getAge() + " years old!");

        e.setWeight(14000);

        System.out.println("The elephant's weight is " + e.getWeight() + " pounds!");
    }
}