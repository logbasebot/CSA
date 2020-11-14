public class Vertex2D {

    // ATTRIBUTES
    int x;
    int y;

    // CONSTRUCTOR
    public Vertex2D(int newX, int newY) {
        x = newX;
        y = newY;
    }

    // METHOD
    public boolean equals(Vertex2D vertex) {
        return (vertex.x == x && vertex.y == y);
    }

}