package tasks32To41;

import java.util.Scanner;

/*Task 35: Password Retry with Early Exit (DO-WHILE + BREAK)
Concept: do-while + break
Task:
Set a predefined password
Allow user to retry maximum 5 times
If password matches:
Print "Login Successful"
Exit loop immediately
Else:
After 5 attempts print "Account Locked"
*/
public class Task35 {
    public static void main(String[] args) {
        PasswordRetryWithEarlyExit();

    }

    public static void PasswordRetryWithEarlyExit() {
        String originalPassword = "Arun@1234";
        int attempt = 1;
        do {
            System.out.println("Enter Your Password");
            Scanner sc = new Scanner(System.in);
            String givenPassword = sc.next();
            if (givenPassword.equals(originalPassword)) {
                System.out.println("Login Successful");
                break;
            } else System.out.println("Password is Wrong! Retry Password");
            if (attempt == 5) {
                System.out.println("Account Locked!");
            }
            attempt++;

        } while (attempt <= 5);

    }
}
