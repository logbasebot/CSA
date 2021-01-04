public class main {
    public static void main (String[] args) {
        Envelope e = new Envelope("Adam", "321 Coffee Court", "Orlando", "Florida", "2193510953");

        Envelope.Describe(e);

        e.setSealed(false);
        e.setMessage("Hello. This is a random letter. Nothing special about it, just pure filler.");
        Envelope.Describe(e);
    }
}
