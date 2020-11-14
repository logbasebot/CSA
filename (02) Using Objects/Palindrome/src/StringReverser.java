public class StringReverser {

    // ATTRIBUTES (INACCESSIBLE) =============
    // ---------------------------------------
    private String message;


    // CONSTRUCTORS ==========================
    // ---------------------------------------
    public StringReverser() {
        message = "";
    }

    public StringReverser(String custom_message) {
        message = custom_message;
    }


    // OTHER METHODS =========================
    // ---------------------------------------
    public String Reverse() {
        String reversed = "";

        for (int i = 0; i < message.length(); i++) {
            // MOVE A CHARACTER FROM ONE STRING TO THE OTHER, BUT IN REVERSE ORDER
            reversed += message.charAt(message.length() - i - 1);
        }

        return reversed;
    }

    public String Reverse(String new_message) {
        message = new_message;

        return Reverse();
    }

}
