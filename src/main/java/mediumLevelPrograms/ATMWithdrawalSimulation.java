package mediumLevelPrograms;

import java.util.Scanner;

/*TASK 3: ATM Withdrawal Simulation (WHILE Loop)
Use only while loop
Initial balance = 10,000
Repeatedly ask the user to:
Enter withdrawal amount
Conditions:
Withdrawal amount must be multiple of 100
Withdrawal amount ≤ balance
Update balance after each withdrawal
Loop should continue until balance becomes 0*/
public class ATMWithdrawalSimulation {
    static int balance = 10000;

    public static void askingUserToEnterTheWithdrawalAmount() {
        System.out.println("Enter withdrawal amount in multiples of 100");
        Scanner scanner = new Scanner(System.in);
        int withdrawalAmount = scanner.nextInt();
        if (withdrawalAmount % 100 == 0) {
            if (withdrawalAmount <= balance) {
                balance = balance - withdrawalAmount;
            } else {
                System.out.println("your balance amount is lesser than entered amount");
            }
        } else {
            System.out.println("The amount is not in a multiple of 100");
        }
    }

    public static void main(String[] args) {

        int i = 1;
        while (balance != 0) {
            askingUserToEnterTheWithdrawalAmount();
            i++;
        }
        System.out.println("Sorry! You can't withdraw anymore as your balance is " + balance);
    }
}
