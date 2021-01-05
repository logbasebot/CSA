
public class main {

    public static void main (String[] args) {

        // ARRAY DECLARATION
        double[] student = new double[4]; // STORES 4 STUDENTS' GRADES

        student[0] = 91.2;
        student[1] = 94.0;
        student[2] = 97.3;
        student[3] = 100.0;

        double total = 0.0;

        for (int i = 0; i < student.length; i++) {
            total += student[i];
        }

        System.out.println("Average grade: " + total/student.length);

        // ARRAY LITERAL
        double[] pupil = {91.2, 94.0, 97.3, 100.0};

        String[] direction = {"North", "South", "East", "West"};
        int dir = 0;
        System.out.println("You are facing " + direction[dir] + ".");

        int[] num;
        boolean[] choice;



        // ARRAY OF INTEGERS, REPRESENTS # OF PETS EACH STUDENT HAS
        // 5 STUDENTS, EVERY STUDENT HAS 1-7 PETS

        int[] pets = {3, 1, 5, 2, 0}; // ARRAY LITERAL USED, DECLARATION WORKS TOO

        // STUDENT #N HAS X PETS
        for (int i = 0; i < pets.length; i++) {
            System.out.println("Student #" + i + " has " + pets[i] + " pets.");
        }

    }

}
