package tasks32To41;

import java.util.Scanner;

/*Task 41: Menu-Driven Loop Control (BREAK + DO-WHILE)
Concept: do-while + break
Task:
Create a menu:
1. View Balance
2. Withdraw
3. Exit

Continue menu until user selects Exit
Use break to terminate loop*/
public class Task41 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("1. View Balance\n" + "2. Withdraw\n" + "3. Exit");
            System.out.println("Enter any number in the memnu");
            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();
            if(menu==3) {
                System.out.println("Thankyou!");//why its accepting more than 3 as well?
                break;
            }
            i++;
        }while(i!=0);
    }
}
