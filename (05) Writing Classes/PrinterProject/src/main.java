public class main {
    public static void main (String[] args) {
        // BOUGHT 2 NEW PRINTERS FOR SOME REASON
        Printer p1 = new Printer();
        Printer p2 = new Printer("5500 Deluxe", 420.0);

        // TURN THEM ON
        p1.setOn(true);
        p2.setOn(true);

        // INK FULL, PAPER FULL
        p1.Print("COVID-19 has affected everyone differently. " +
                "Ensuring that students have the opportunity to " +
                "delve into internships related to their career is critical. " +
                "We must strive to create a fruitful workforce in a post-COVID era.");

        p2.Print("There are clearly multiple advantages and disadvantages, but at the " +
                "end of the day, we can conclude that the internet is a useful resource to " +
                "communicate with interns remotely.");

        // INK FULL, PAPER EMPTY
        p1.setPaper(0);
        p2.setPaper(0);

        p1.Print("This will most likely not print.");
        p2.Print("Yep, definitely did not print.");

        // INK EMPTY, PAPER FULL
        p1.setInk(0.0);
        p1.setPaper(10);
        p2.setInk(0.0);
        p2.setPaper(10);

        p1.Print("This will most likely not print.");
        p2.Print("Yep, definitely did not print.");

        // TURNED OFF
        p1.setOn(false);
        p2.setOn(false);

        p1.Print("This will most likely not print.");
        p2.Print("Yep, definitely did not print.");
        
    }
}