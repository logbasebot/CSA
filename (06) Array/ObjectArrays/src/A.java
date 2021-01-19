public class A {

    // DUMMY ATTRIBUTES
    private int id;
    private static int count;

    // CONSTRUCTOR
    public A () {
        id = count;
        count++;
    }

    // METHOD
    public void Talk () {
        System.out.println("My ID number is: " + id);
    }

}