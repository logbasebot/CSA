public class main {

    public static void main (String[] args) {
        int[] test = {34, 12, 56, 89, 78, 0, 100};
        Sort(test, 0, test.length - 1);

        for (int i : test) {
            System.out.println(i);
        }

    }

    public static void Merge (int[] number, int left, int middle, int right) {

        // STORE SIZE OF LEFT AND RIGHT HALF
        int size_left = middle - left + 1;
        int size_right = right - middle;

        // SPLIT THE ARRAY INTO A LEFT AND RIGHT HALF
        int[] array_left = new int[size_left];
        int[] array_right = new int[size_right];

        // FILL LEFT ARRAY WITH LEFT HALF
        for (int i = 0; i < size_left; i++) {
            array_left[i] = number[left+i];
        }

        // FILL RIGHT ARRAY WITH RIGHT HALF
        for (int i = 0; i < size_right; i++) {
            array_right[i] = number[middle+i+1];
        }

        //
        int left_index = 0;
        int right_index = 0;
        int i = left;

        while (left_index < size_left && right_index < size_right) {
            if (array_left[left_index] < array_right[right_index]) {
                number[i] = array_left[left_index];
                left_index++;
            }
            else {
                number[i] = array_right[right_index];
                right_index++;
            }
            i++;
        }

        while (left_index < size_left) {
            number[i] = array_left[left_index];
            left_index++;
            i++;
        }

        while (right_index < size_right) {
            number[i] = array_right[right_index];
            right_index++;
            i++;
        }

    }

    public static void Sort (int[] number, int left, int right) {
        // HAVE WE SPLIT EVERYTHING INTO SMALLER GROUPS? IF NOT:
        if (left < right) {
            int middle = (right + left)/2;

            Sort(number, left, middle); // SORT LEFT HALF
            Sort(number, middle+1, right); // SORT RIGHT HALF
            Merge(number, left, middle, right); // MERGE
        }

    }



}