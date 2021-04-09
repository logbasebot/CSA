
public class Vertex3D extends Vertex2D {
    // ATTRIBUTES
    public int z;

    // CONSTRUCTORS
    public Vertex3D () {
        z = 0;
    }

    public Vertex3D (int x, int y, int z) {
        // this.x = x;
        // this.y = y;
        super(x,y);
        this.z = z;
    }

    // METHODS
    public String toString () {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public String Flatten () {
        // ACCESS SUPERCLASS
        return super.toString();
    }

}
