import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        // ARRAY LITERAL
        String[] names = {"Kidlat Hartley", "Lidija Raguel",
                        "Ji-Soo Julius", "Bonolo Suraj", "Priska Tlaloc"};

        // USER INPUT
        System.out.println("Enter a name: ");
        String target = input.nextLine();

        // CALL METHOD WITH INPUT AS PARAMETER
        System.out.println("Target name on list: " + checkName(names, target));

        // --------------------------------------------------------------------

        int big = 42069;
        int[] test = explodeNumber(big);

        for (int i : test) {
            System.out.println(i);
        }

    }

    public static int[] explodeNumber (int n) {

        // CASTS INT TO STRING
        String string_num = "" + n;
        int[] result = new int[string_num.length()];

        for (int i = 0; i < string_num.length(); i++) {
            String temp = (string_num.substring(i,i+1));
            int num = Integer.parseInt(temp);
            //num *= (int) Math.pow(10, string_num.length() - i - 1);
            result[i] = num;
        }


        return result;
    }

    public static boolean checkName (String[] arr, String target) {
        // FOR EACH LOOP
        for (String name : arr) {
            if (target.toLowerCase().equals(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

}