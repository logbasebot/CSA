public class main {
    public static void main (String[] args) {

        // PROBLEM #1 (EASY) -------------------------------------- //
        // ======================================================== //
        double[] normal = {0.25, 0.33, 0.4, 0.125, 0.875, 0.625, 0.99, 0.0};

        // CREATE A SECOND ARRAY OF DOUBLES CALLED inverse,
        // WHICH IS THE SAME SIZE AS normal.
        double[] inverse = new double[8];

        // USING A FOR-LOOP, SET THE VALUE OF EACH MEMBER IN
        // THE inverse ARRAY TO 1 MINUS THE VALUE OF THE
        // CORRESPONDING MEMBER OF THE normal ARRAY.  FOR
        // EXAMPLE, inverse[0] SHOULD BE 0.75.
        for (int i = 0; i < inverse.length; i++) {
            inverse[i] = 1 - normal[i];
        }

        // PRINT THE CONTENTS OF BOTH ARRAYS SO THAT THE
        // NORMAL VALUE AND ITS INVERSE APPEAR ON THE SAME
        // LINE, FOR EXAMPLE:
        //      0.25     0.75
        for (int i = 0; i < inverse.length; i++) {
            System.out.println(normal[i] + " " + inverse[i]);
        };

        // PROBLEM #2 (HARD) -------------------------------------- //
        // ======================================================== //
        int[] forward = {0, 1, 1, 2, 3, 5, 8, 13, 21};

        // CREATE A SECOND ARRAY OF INTEGERS CALLED backward,
        // WHICH IS THE SAME SIZE AS forward.
        int[] backward = new int[9];

        // USING A FOR-LOOP, SET THE VALUE OF EACH MEMBER IN
        // THE backward ARRAY USING VALUES FROM THE forward
        // ARRAY, SO THAT THE VALUES APPEAR IN REVERSE ORDER.
        // FOR EXAMPLE, backward[0] SHOULD BE 21.
        int a = 0;
        for (int i = backward.length - 1; i >= 0; i--) {
            backward[i] = forward[a];
            a++;
        }
        // PRINT THE CONTENTS OF BOTH ARRAYS SO THAT THE
        // FORWARD VALUE AND ITS BACKWARD COMPANION APPEAR ON
        // THE SAME LINE, FOR EXAMPLE:
        //      0     21
        //      1     13
        //      1     8
        for (int i = 0; i < backward.length; i++) {
            System.out.println(forward[i] + " " + backward[i]);
        }

    }
}