public class main {
    public static void main (String[] args) {

        Square s1 = new Square();
        System.out.println("====Square====");

        System.out.println("Segments: " + s1.num_segments);
        System.out.println("Length: " + s1.length);
        System.out.println("Perimeter: " + s1.Perimeter() );
        System.out.println("Area: " + s1.Area() );


        Triangle t1 = new Triangle();
        System.out.println("====Triangle====");

        System.out.println("Segments: " + t1.num_segments);
        System.out.println("Length: " + t1.length);
        System.out.println("Perimeter: " + t1.Perimeter() );
        System.out.println("Area: " + t1.Area() );

    }
}
