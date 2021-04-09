public class Square extends EquilateralPolygon {

    // CONSTRUCTOR
    public Square() {
        num_segments = 4;
        length = 12;
    }

    // OVERRIDES METHOD IN PARENT CLASS
    public double Area () {
        return length * length;
    }

}
