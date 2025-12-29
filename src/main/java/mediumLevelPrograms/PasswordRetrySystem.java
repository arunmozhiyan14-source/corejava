package mediumLevelPrograms;
/*TASK 4: Password Retry System (DO-WHILE Loop)
Use only do-while loop
Set a predefined password
Allow the user to retry entering the password
Conditions:
Maximum 3 attempts
Print:
"Login Successful" if matched
"Account Locked" after 3 failures
*/

import java.util.Scanner;

public class PasswordRetrySystem {

    static String preDefinedPassword = "Arun@123456";
    public static String retryPassword() {
        System.out.println("Retry your password!");
        Scanner scanner = new Scanner(System.in);
        String retriedPassword = scanner.next();
        return retriedPassword;
    }
    public static void main(String[] args) {
        int i = 0;
        do {
            String retriedPassword = retryPassword();
            if (retriedPassword.equals(preDefinedPassword)){
            System.out.println("Password Matched");
            } else {
                retryPassword();
            }
            i++;
            }
            while (i <= 1) ;
        }

    }

