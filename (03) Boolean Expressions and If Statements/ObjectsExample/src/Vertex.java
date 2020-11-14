public class Vertex {

    // PROPERTIES OR ATTRIBUTES
    public double X;
    public double Y;
    public double Z;

    // CONSTRUCTOR METHOD
    public Vertex() {
        X = 0.0;
        Y = 0.0;
        Z = 0.0;
    }

    // CUSTOM PARAMETERS
    public Vertex(double custom_x, double custom_y, double custom_z) {
        X = custom_x;
        Y = custom_y;
        Z = custom_z;
    }

    // OTHER METHODS
    public void Print() {
        System.out.println("[" + X + ", " + Y + ", " + Z + "]");
    }

}
