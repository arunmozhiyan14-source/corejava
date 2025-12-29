import java.util.Scanner;

/*TASK 7: Menu-Driven Calculator (DO-WHILE)
Display menu:
1. Add
2. Subtract
3. Multiply
4. Exit
Perform operations using user input
Continue showing menu until user selects Exit
*/

public static void main(String[] args) {


    int i = 0;
    int menu;
    do {
        System.out.println("Please select the number 1 to 4 to perform that operation\n" + "1. Add\n" +
                "2. Subtract\n" +
                "3. Multiply\n" +
                "4. Exit");
        Scanner scanner = new Scanner(System.in);
        menu = scanner.nextInt();
        System.out.println("Enter the first number");
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();
        System.out.println("Enter the second number");
        Scanner scanner2 = new Scanner(System.in);
        int num2 = scanner2.nextInt();
        switch (menu) {
        case 1:
            System.out.println("The addition of " + num1 + "and " + num2 + "is " + (num1 + num2));
            break;
        case 2:
            System.out.println("The subtraction of " + num1 + "and " + num2 + "is " + (num1 - num2));
            break;
        case 3:
            System.out.println("The multiplication of " + num1 + "and " + num2 + "is " + (num1 - num2));
            break;
        case 4:
            break;
        }
        i++;
    } while (menu <4);
}