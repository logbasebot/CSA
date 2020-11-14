import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
/*
        // EASY MODE, CHALLENGE #1
        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        }

        // EASY MODE, CHALLENGE #2
        System.out.println("Input the number of asterisks: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println(); // SPACE

        // EASY MODE, CHALLENGE #3
        System.out.println("Enter a string: ");
        String str1 = input.next();

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
        System.out.println(); // sPACE

        // NORMAL MODE, CHALLENGE #1
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println(); // SPACE

        // NORMAL MODE, CHALLENGE #2
        System.out.println("Input a number: ");
        int k = input.nextInt();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        // NORMAL MODE, CHALLENGE #3
        System.out.println("Enter a string: ");
        String str2 = input.next();

        for (int i = 0; i < str2.length(); i+=2) {
            System.out.print(str2.charAt(i));
        }

        System.out.print(" "); // SPACE

        for (int i = 1; i < str2.length(); i+=2) {
            System.out.print(str2.charAt(i));
        }

        System.out.println();

        // HARD MODE, CHALLENGE #1
        for (int i = 26; i >= 12; i-=2) {
            System.out.println(i);
        }


        // HARD MODE, CHALLENGE #2
        System.out.println("Input a number: ");
        int q = input.nextInt();

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < q - i; j++) {
                System.out.print("^");
            }
            System.out.println();
        }


        // HARD MODE, CHALLENGE #3
*/
        System.out.println("Enter a string: ");
        String str3 = input.next();

        boolean doesRepeat = false;

        for (int i = 0; i < str3.length(); i++) {

            for (int j = 0; j < str3.length(); j++) {
                if (str3.charAt(i) == str3.charAt(j) && str3.indexOf(str3.charAt(i), i+1) != -1) {
                    doesRepeat = true;
                    break;
                }
            }

        }

        System.out.println(doesRepeat);

        Scanner specialInput = new Scanner(System.in);

        // BONUS CHALLENGE
        System.out.println("Enter a string: ");
        String str4 = specialInput.nextLine();

        int index = 0;
        String str5 = "";

        for (int i = 0; i < str4.length(); i++) {
            char temp = str4.charAt(i);

            if (index%2 == 0) temp += 1;
            else temp -= 1;

            str5 += temp;
            index++;
        }

        System.out.println(str5);

    }
}
