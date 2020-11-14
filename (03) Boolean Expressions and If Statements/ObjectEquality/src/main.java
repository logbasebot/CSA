

public class main {
    public static void main (String[] args) {

        // OBJECTS
        Vertex2D v1 = new Vertex2D(10, 100);
        Vertex2D v2 = new Vertex2D(10, 100);

        // MEMORY ADDRESSES (E.G. @75bd9247) ARE COMPARED, BIG NONO
        /*
        if (v1 == v2) {
            System.out.println("They are the same!");
        }
        else {
            System.out.println("They are different!");
        }

        System.out.println(v1);
        System.out.println(v2);
        */

        if (v1.equals(v2) ) {
            System.out.println("They are ACTUALLY the same!");
        }
        else {
            System.out.println("They are not ACTUALLY the same!");
        }

        Vertex2D v3;
        v3 = v1; // SAME MEMORY ADDRESS, 'ALIASES'

        System.out.println(v1.x);
        v3.x = 24; // OBJECTS ARE ALIASES, SO A CHANGE IN ONE OBJECT CHANGES THE OTHER OBJECT

        System.out.println(v1.x); // CHANGE ON V3 REFLECTED ON V1
    }

}