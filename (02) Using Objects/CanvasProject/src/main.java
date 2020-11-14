public class main {

    public static void main (String[] args) {
        Canvas canvas1 = new Canvas();
        Canvas canvas2 = new Canvas(1024, 768, 24);
        System.out.println("canvas1 and canvas2, equal?: " + canvas1.equals(canvas2) );

        Canvas canvas3 = new Canvas();
        System.out.println("canvas1 and canvas3, equal?: " + canvas1.equals(canvas3) );
        System.out.println("canvas1 and canvas3, same alias?: " + (canvas1 == canvas3) );
    }
}