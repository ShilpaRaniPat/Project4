import java.util.Scanner;

import static java.lang.String.valueOf;

public class characterCount {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String inputstr = scan.nextLine().toLowerCase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to be found:");
       // char c = sc.next(".").toLowerCase().charAt(0);
        char c = sc.next().toLowerCase().charAt(0);

        int countChar;
        if (!inputstr.equals(null)) {

            String b;
            if (inputstr.contains(valueOf(c))) {
                int cn = inputstr.length() - inputstr.replaceAll(valueOf(c), "").length();
                System.out.println(cn);

            }


        }
        return;
    }
}
