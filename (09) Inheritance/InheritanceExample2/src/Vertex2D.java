
public class Vertex2D {

    // ATTRIBUTES
    public int x;
    public int y;

    // CONSTRUCTORS
    public Vertex2D () {
        int x = 0;
        int y = 0;
    }

    public Vertex2D (int x, int y) {
        this.x = x;
        this.y = y;
    }

    // OVERRIDDEN METHODS
    public String toString () {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals (Vertex2D vertex) {
        return (x == vertex.x && y == vertex.y);
    }

}
