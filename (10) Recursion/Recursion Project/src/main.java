import java.util.ArrayList;

public class main {

    public static void main (String[] args) {
        /*
        ArrayList<Integer> test = new ArrayList<>();

        test.add(34);
        test.add(12);
        test.add(56);
        test.add(89);
        test.add(0);
        test.add(100);

        Sort(test, 0, test.size() - 1);

        for (int i : test) {
            System.out.println(i);
        }
        */

        ArrayList<String> test = new ArrayList<>();

        test.add("Luke Skywalker");
        test.add("Darth Vader");
        test.add("Yoda");
        test.add("Chewbacca");
        test.add("Boba Fett");

        Sort(test, 0, test.size() - 1);

        for (String s : test) {
            System.out.println(s);
        }


    }

    public static void Merge (ArrayList<String> name, int left, int middle, int right) {

        // STORE SIZE OF LEFT AND RIGHT HALF
        int size_left = middle - left + 1;
        int size_right = right - middle;

        // SPLIT THE ARRAY INTO A LEFT AND RIGHT HALF
        String[] array_left = new String[size_left];
        String[] array_right = new String[size_right];

        // FILL LEFT ARRAY WITH LEFT HALF
        for (int i = 0; i < size_left; i++) {
            array_left[i] = name.get(left+i);
        }

        // FILL RIGHT ARRAY WITH RIGHT HALF
        for (int i = 0; i < size_right; i++) {
            array_right[i] = name.get(middle+i+1);
        }

        // FINAL COMPARISON TIME
        int left_index = 0;
        int right_index = 0;
        int i = left;

        while (left_index < size_left && right_index < size_right) {
            // COMPARE LEXICOGRAPHICALLY
            if (array_left[left_index].compareTo(array_right[right_index]) < 0) {
                name.set(i, (array_left[left_index]));
                left_index++;
            }
            else {
                name.set(i, array_right[right_index]);
                right_index++;
            }
            i++;
        }

        while (left_index < size_left) {
            name.set(i, array_left[left_index]);
            left_index++;
            i++;
        }

        while (right_index < size_right) {
            name.set(i, array_right[right_index]);
            right_index++;
            i++;
        }

    }

    public static void Sort (ArrayList<String> name, int left, int right) {
        // HAVE WE SPLIT EVERYTHING INTO SMALLER GROUPS? IF NOT:
        if (left < right) {
            int middle = (right + left)/2;

            Sort(name, left, middle); // SORT LEFT HALF
            Sort(name, middle+1, right); // SORT RIGHT HALF
            Merge(name, left, middle, right); // MERGE
        }

    }

}