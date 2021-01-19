public class main {
    public static void main (String[] args) {

        A[] arr = new A[4];

        // NORMAL FOR-LOOP
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new A();
        }

        // ENHANCED FOR-LOOP
        for (A val : arr) {
            val.Talk();
        }

    }
}