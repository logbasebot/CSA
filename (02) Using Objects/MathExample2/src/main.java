public class main {

    public static void main(String[] args) {

        int count = 10;
        System.out.println(count);

        System.out.println(++count); // PRE-INCREMENTER
        System.out.println(count++); // POST-INCREMENTER

        double result = 123 / 456.7;

        int num1 = 10;
        int num2 = 3;

        double quotient = (double)num1/num2; // CAST TEMPORARILY TREATS NUM1 AS A DOUBLE

        System.out.println(quotient);

        double d1 = 3.14159;
        int pi = (int)d1;
        System.out.println(pi);
        System.out.println(d1);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE + 1);


    }
}
