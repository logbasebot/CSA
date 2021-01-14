public class main {
    public static void main (String[] args) {

        String[] titles = new String[5];

        titles[0] = "Braiding Sweetgrass";
        titles[1] = "We Were Liars";
        titles[2] = "Catch 22";
        titles[3] = "On Writing The College Application Essay";
        titles[4] = "Persepolis";

        // BASIC FOR LOOP
        for (int i = 0; i < titles.length; i++) {
            System.out.println(titles[i]);
        }

        System.out.println("-------------------------");

        // ENHANCED FOR LOOP - (<type> title : array)
        for (String books : titles) {
            System.out.println(books);
        }


        double[] temperature = {98.6, 98.4, 98.7, 100.0, 92.4};

        // BASIC FOR LOOP
        double sum1 = 0.0;

        for (int i = 0; i < temperature.length; i++) {
            sum1 += temperature[i];
        }

        double average1 = sum1/(double)temperature.length;
        System.out.println("Average temperature: " + average1);


        // ENHANCED FOR LOOP
        double sum2 = 0.0;

        for (double temp : temperature) {
            sum2 += temp;
        }

        double average2 = sum2/(double)temperature.length;
        System.out.println("Average temperature: " + average2);


    }
}
