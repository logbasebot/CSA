public class main {

    public static void main (String[] args) {

        // NORMAL ARRAY, 3x2, RECTANGULAR
        int[][] arr1 = { {0,1},
                        {2,3},
                        {4,5} };

        // JAGGED ARRAY, 3x?, NON-RECTANGULAR
        int[][] arr2 = { {0,1},
                        {3},
                        {4,5,6} };

        // JAGGED ARRAY FOR-LOOP
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }

        // JAGGED ARRAY LITERAL DECLARATION, 3X?
        int[][] arr3 = new int[3][];

        // MANUALLY DECLARE THE LENGTH OF EACH COLUMN
        arr3[0] = new int[2];
        arr3[1] = new int[1];
        arr3[2] = new int[3];

        // ASSIGN VALUES
        arr3[0][0] = 0;
        arr3[0][1] = 1;

        arr3[1][0] = 3;

        arr3[2][0] = 4;
        arr3[2][1] = 5;
        arr3[2][2] = 6;
    }

}
