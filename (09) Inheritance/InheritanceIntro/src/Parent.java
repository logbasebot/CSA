// PARENT CLASS
public class Parent {

    // ATTRIBUTES
    public int x;
    public int y;
    public String name;
    public String job;

    // CONSTRUCTOR
    public Parent() {
        name = "David Sushil";
        job = "Welder";
    }

    // METHOD
    public void DoStuff() {
        System.out.println("Hello, World!");
    }

    public void Describe () {
        System.out.println(name + ", " + job);
    }

}