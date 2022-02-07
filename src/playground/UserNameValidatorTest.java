package playground;

import java.util.Scanner;

public class UserNameValidatorTest {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            UsernameValidator.matches(userName);
        }
    }
}

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    private static final String regularExpression = "[a-zA-Z](\\w){7,29}";

    public static void matches(String userName) {
        if (userName.matches(UsernameValidator.regularExpression)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

}