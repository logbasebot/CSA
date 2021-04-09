public class main {
    public static void main (String[] args) {
        A a1 = new A();
        A a2 = new A(10);
        System.out.println();

        A b1 = new A();
        // B b2 = new B(10);
        System.out.println();

        A c1 = new C();
        A c2 = new C(10);
        System.out.println();

        A d1 = new D();
        A d2 = new D(10);
        System.out.println();
    }

    /*
    1. DONE.
    2. OBJECT A CALLS BOTH OF A'S CONSTRUCTORS, OBJECT B CALLS A'S DEFAULT CONSTRUCTOR,
       OBJECT C CALLS BOTH CONSTRUCTORS FROM A AND C, OBJECT D CALLS BOTH OF A'S CONSTRUCTORS TWICE.
       -------------------------------------------------------------------------------------------------------
    3. IF ALL DECLARATIONS ARE STORED AS A'S, ALL CONSTRUCTOR CALLS REMAIN THE SAME.
       THIS IS BECAUSE THE SUPERCLASS (A) OBJECTS ONLY CALL THE SUBCLASS (B/C/D)
       CONSTRUCTORS, WHICH THEY HAVE ACCESS TO.
    4. IF WE MAKE CLASS D INHERIT FROM CLASS C, THEN OBJECT D CALLS A/C DEFAULT, A DEFAULT (TWICE), C/A CUSTOM.
     */
}
