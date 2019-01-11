import java.util.Scanner;

public class regularExpression {
    public static boolean main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String inputstr = scan.nextLine();
        System.out.println("Enter the word to be searched:");
        String word = scan.next();
        if (inputstr.contains(word)) {
            return true;

        } else {
            return false;

        }
    }
}



