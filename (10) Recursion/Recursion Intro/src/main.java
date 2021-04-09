public class main {

    public static void main (String[] args) {
        Count(5);
        System.out.println("----------");
        CountAgain(0, 5);
        System.out.println("----------");
        System.out.println(Sum(5) );
        System.out.println("----------");
        System.out.println(Exist("helloooo", "z") );
    }

    public static void Foo () {
        System.out.println("Hello, world!");
        Foo(); // CALLS ITSELF
    }

    public static void Count (int n) {
        if (n >= 0) {
            Count(n-1);
            System.out.println(n);
        }
    }

    // COUNT FROM a TO b
    public static void CountAgain (int a, int b) {
        if (a <= b) {
            System.out.println(a);
            CountAgain(a+1, b);
        }

    }

    // SUM OF FIRST n NUMBERS
    public static int Sum (int n) {
        if (n != 0) {
            return n + Sum(n-1);
        }
        return n;
    }

    // FIND A TARGET CHARACTER c IN STRING s
    public static boolean Exist (String s, String c) {
        // IF NOTHING IS FOUND
        if (s.length() == 0) {
            return false;
        }

        // IS THE FIRST CHARACTER EQUAL?
        if (s.substring(0,1).equals(c)) {
            return true;
        }

        // CALL AGAIN, REMOVE FIRST CHARACTER EACH TIME
        return Exist(s.substring(1, s.length()), c);
    }


}
