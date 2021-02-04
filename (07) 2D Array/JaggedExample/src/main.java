public class main {
    public static void main (String[] args) {

        int[][] years = {{2020, 2010, 2000, 1990, 1980},
                    {2012, 1997},
                    {1981},
                    {2014, 2007, 2000, 1993, 1985, 1978, 1971},
                    {2001, 1983}};
        String[] comets = {"3200 Phaethon", "Boattini", "Hill", "Pruyne", "Lagerkvist"};


        for (int i = 0; i < years.length; i++) {
            System.out.print(comets[i] + " (");

            for (int j = 0; j < years[i].length; j++) {
                if (j == years[i].length - 1) System.out.print(years[i][j]);
                else System.out.print(years[i][j] + ", ");
            }

            System.out.println(")");
        }

    }
}
