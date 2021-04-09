
public class main {
    public static void main (String[] args) {

        // PARENT CLASS OBJECT
        Parent p1 = new Parent();

        p1.x = 10;
        p1.y = 20;
        // p1.z = 30; CHILD CANNOT PASS TO PARENT
        p1.DoStuff();
        p1.Describe();
        // p1.Foo();  CHILD CANNOT PASS TO PARENT

        // ATTRIBUTES AND METHODS FROM PARENT CLASS ARE PASSED DOWN
        Child c1 = new Child();

        c1.x = 30;
        c1.y = 40;
        c1.z = 50;
        c1.DoStuff();
        c1.Foo();
        c1.Describe();

    }
}