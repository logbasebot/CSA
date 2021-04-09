
public class main {
    public static void main (String[] args) {
        // SUPERCLASS OBJECT
        Vertex2D v1 = new Vertex2D(100, 200);

        // OVERRIDDEN toString METHOD ALLOWS US TO PRINT
        System.out.println(v1);

        // SUBCLASS OBJECT
        Vertex3D v2 = new Vertex3D(300, 400, 500);
        // OVERRIDDEN toString METHOD ALLOWS US TO PRINT
        System.out.println(v2);


    }

}
