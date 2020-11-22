public class Elephant {

    // ATTRIBUTES: "HAS A"
    private double weight;
    private int age;

    // METHODS: "DOES"
    public Elephant () {
        age = RestrictAge(0);
        weight = 200;
    }

    public Elephant (int custom_age, double custom_weight) {
        this.age = RestrictAge(custom_age);
        this.weight = RestrictWeight(custom_weight);
    }

    private int RestrictAge (int age) {
        if (age < 0) age = 0;
        if (age > 80) age = 80;

        return age;
    }

    private double RestrictWeight (double custom_weight) {
        if (custom_weight < 200) custom_weight = 200;
        if (custom_weight > 14000) custom_weight = 14000;


        return custom_weight;
    }

    // ACCESSOR
    public int getAge () {
        return age;
    }

    public double getWeight () {
        return weight;
    }

    // MUTATOR
    public void setWeight (double new_weight) {
        double delta = new_weight - weight;

        if (delta > 10) delta = 10;
        if (delta < -10) delta = -10;

        weight += delta;
        weight = RestrictWeight(weight);
    }

    // MUTATOR
    public void setAge(int age) {
        this.age = RestrictAge(age);
    }
}
