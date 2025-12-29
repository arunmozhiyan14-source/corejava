package tasks32To41;

import java.util.Scanner;

/*Task 37 : ATM Withdrawal with Cancel Option (WHILE + BREAK)
Concept: while + break
Task:
Initial balance = 5000
Ask user to enter withdrawal amount
If user enters 0:
Print "Transaction Cancelled"
Exit loop
Otherwise:
Deduct amount from balance
Loop continues until balance becomes 0
*/
public class Task37 {
    public static void main(String[] args) {
        ATMWithdrawal();
    }
    public static void ATMWithdrawal(){
        int initialBalance = 5000;
        int i = 0;
        while(initialBalance!=0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Withdrawal Amount");
            int withdrawalAmount = sc.nextInt();
            if(withdrawalAmount==0) {
                System.out.println("Invalid Amount. Your Transaction Cancelled");
                break;
            }
            else
                initialBalance -= withdrawalAmount;

        }
        System.out.println("Your account balance is "+ initialBalance);
    }
}
