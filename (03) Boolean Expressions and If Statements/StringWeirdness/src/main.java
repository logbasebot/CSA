

public class main {

    public static void main(String[] args) {

        String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        System.out.println(str1 == str2); // NO new KEYWORD, TREATED AS PRIMITIVE DT

        String str3 = new String("Hello, World!");
        String str4 = new String("Hello, World!");
        System.out.println(str3 == str4); // USE OF new KEYWORD, TREATED AS OBJECTS (i.e. ADDRESS)
        System.out.println(str1 == str4); // MIXING DEFAULTS TO OBJECT ADDRESS

        String str5 = str3;
        str5 = "Something else..."; // VALUE OF STR3 DOES NOT CHANGE
        System.out.println(str3);

        System.out.println(str1.equals(str4) ); // .equals() COMPARES VALUES (i.e. NOT ADDRESS)
    }

}