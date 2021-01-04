public class Envelope {

    // STATIC ATTRIBUTES
    private static String sender;
    private static String s_address;
    private static String s_city;
    private static String s_state;
    private static String s_zip;

    // ATTRIBUTES
    private String recipient;
    private String r_address;
    private String r_city;
    private String r_state;
    private String r_zip;

        // BY DEFAULT
    private String message = "";
    private boolean sealed = true;

    // CONSTRUCTORS

    public Envelope () {
        sender = "David Sushil";
        s_address = "123 Random Street";
        s_city = "Anytown";
        s_state = "FL";
        s_zip = "12345";
    }

    public Envelope (String recipient, String r_address, String r_city, String r_state, String r_zip) {
        sender = "David Sushil";
        s_address = "123 Random Street";
        s_city = "Anytown";
        s_state = "FL";
        s_zip = "12345";

        setRecipient(recipient);
        setR_address(r_address);
        setR_city(r_city);
        setR_state(r_state);
        setR_zip(r_zip);
    }

    // ACCESSORS
    public static String getSender() {
        return sender;
    }

    public static String getS_address() {
        return s_address;
    }

    public static String getS_city() {
        return s_city;
    }

    public static String getS_state() {
        return s_state;
    }

    public static String getS_zip() {
        return s_zip;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getR_address() {
        return r_address;
    }

    public String getR_city() {
        return r_city;
    }

    public String getR_state() {
        return r_state;
    }

    public String getR_zip() {
        return r_zip;
    }

    public String getMessage() {
        if (!sealed) return message;
        else return "You must unseal the envelope!";
    }

    public boolean getSealed () {
        return sealed;
    }

    // MUTATORS

    public void setRecipient(String recipient) {
        if (recipient.length() >= 1) this.recipient = recipient;
        else this.recipient = "Person";
    }

    public void setR_address(String r_address) {
        if (r_address.length() >= 1) this.r_address = r_address;
        else this.r_address = "123 Clown Court";
    }

    public void setR_city(String r_city) {
        if (r_city.length() >= 1) this.r_city = r_city;
        else this.r_city = "Anytown";
    }

    public void setR_state(String r_state) {
        this.r_state = r_state.substring(0, 3);
    }

    public void setR_zip(String r_zip) {
        this.r_zip = r_zip.substring(0, 5);
    }

    public void setMessage (String message) {
        if (!sealed) this.message = message;
        else System.out.println("You must unseal the envelope!");
    }

    public void setSealed (boolean sealed) {
        this.sealed = sealed;
    }

    // METHOD

    public static void Describe (Envelope letter) {
        // SENDER
        System.out.println("Sender: " + getSender() );
        System.out.println("Sender's address: " + getS_address() );
        System.out.println("Sender's city: " + getS_city() );
        System.out.println("Sender's state: " + getS_state() );
        System.out.println("Sender's zip code: " + getS_zip() );

        System.out.println(); // SPACE

        // RECEIVER
        System.out.println("Recipient: " + letter.getRecipient());
        System.out.println("Recipient's address: " + letter.getR_address());
        System.out.println("Recipient's city: " + letter.getR_city());
        System.out.println("Recipient's state: " + letter.getR_state());
        System.out.println("Recipient's zip code: " + letter.getR_zip());

        System.out.println(); // SPACE
        System.out.println(letter.getMessage() ); // METHOD ITSELF CHECKS FOR SEAL
    }

}
