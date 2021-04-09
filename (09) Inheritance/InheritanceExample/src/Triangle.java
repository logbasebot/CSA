public class Triangle extends EquilateralPolygon {

    // CONSTRUCTOR
    public Triangle () {
        num_segments = 3;
        length = 1;
    }

    // OVVERIDES METHOD IN PARENT CLASS
    public double Area () {
        return Math.sqrt(3)/4 * Math.pow(length,2);
    }

}
