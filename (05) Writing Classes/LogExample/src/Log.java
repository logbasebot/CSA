import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class Log {

    // STATIC ATTRIBUTES
    private static boolean initialized; // CHECK INITIALIZATION
    private static BufferedWriter output; // BW OBJECT

    private Log () {} // PRIVATE CONSTRUCTOR, NO Log OBJECTS

    public static void Write (String message) throws IOException {

        if (!initialized) {
            output = new BufferedWriter(new FileWriter("log.txt") );
            initialized = true;
        }

        output.write(LocalDate.now() + ", " + LocalTime.now() + ": " + message + "\n");
        System.out.println(LocalDate.now() + ", " + LocalTime.now() + ": " + message);

    }

    public static void Close() throws IOException {
        if (initialized) {
            output.flush();
            output.close();
            initialized = false;
        }

    }

}