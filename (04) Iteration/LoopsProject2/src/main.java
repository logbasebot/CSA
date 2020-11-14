public class main {
    public static void main (String[] args) {

        // NUMBER 1
        for (int i = 34; i <= 46; i++) {
            System.out.print(i + ", ");
        }

        // SPACE...
        System.out.println();

        int j = 34;
        while (j <= 46) {
            System.out.print(j + ", ");
            j++;
        }

        // SPACE...
        System.out.println();

        // NUMBER 2
        for (int i = 100; i >= 52; i-=4) {
            System.out.print(i + ", ");
        }

        // SPACE...
        System.out.println();

        int k = 100;
        while (k >= 52) {
            System.out.print(k + ", ");
            k -= 4;
        }

        // SPACE...
        System.out.println();

        // NUMBER 3
        for (int i = 1; i < 200; i*=2) {
            System.out.print(i + ", ");
        }

        // SPACE...
        System.out.println();

        int p = 1;
        while (p < 200) {
            System.out.print(p + ", ");
            p *= 2;
        }

        // SPACE...
        System.out.println();

        // NUMBER 4
        for (int i = 200; i >= 1; i/=2) {
            System.out.print(i + ", ");
        }

        // SPACE...
        System.out.println();

        int q = 200;
        while (q >= 1) {
            System.out.print(q + ", ");
            q /= 2;
        }

    }
}
