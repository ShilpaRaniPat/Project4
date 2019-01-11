import java.util.Scanner;

import static java.lang.String.valueOf;

public class ReplaceChar {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String inputstr = scan.nextLine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to be replaced:");
        char c = sc.next(".").charAt(0);
        System.out.println("Enter the character to be used:");
        char d = sc.next(".").charAt(0);

        if (!inputstr.equals(null)) {

            String b;
            if (inputstr.contains(valueOf(c))) {
                b = inputstr.replaceAll(valueOf(c), valueOf(d));
                System.out.println(b);
            }
        }
    }
}
