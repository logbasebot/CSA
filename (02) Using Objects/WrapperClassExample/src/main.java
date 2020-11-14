public class main {

    public static void main (String[] args) {

        int pd1 = 12; // PRIMITIVE DATA INTEGER

        Integer object1; // CLASS (WRAPPER) INTEGER
        object1 = 12; // DO NOT CALL CONSTRUCTOR

        pd1 = Integer.MAX_VALUE; // STATIC METHOD FROM INTEGER CLASS

        String userInput;
        userInput = "12"; // STRING LITERAL

        object1 = Integer.parseInt(userInput); // PARSES (CONVERTS) STRING LITERAL TO INTS

        Foo(object1);

        Double object2; // CLASS (WRAPPER) DOUBLE, SAME CONCEPT
        object2 = 14.5; // DO NOT CALL CONSTRUCTOR


        String str1;
        str1 = "When in the course of human events...";

        int firstC = str1.indexOf('c');
        System.out.println("First c: " + firstC); // INDEX STARTS AT 0

        int firstSpace = str1.indexOf(" ");
        System.out.println("First space: " + firstSpace);

        int firstZ = str1.indexOf('z');
        System.out.println(firstZ); // INDEX OF -1, ERROR CODE

        System.out.println(str1.toUpperCase() ); // ALL UPPERCASE
        System.out.println(str1.toLowerCase() ); // ALL LOWERCASE
        

    }

    public static void Foo(int bar) {
        // UNBOXES WRAPPED Integer INTO PD int
        System.out.println(bar);
    }

}