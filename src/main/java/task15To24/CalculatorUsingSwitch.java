package task15To24;

import java.util.Scanner;

/*Task 16: Calculator Using Switch
Ask the user for two numbers and an operator (+ - * / %).
Use a switch to perform the correct operation.*/

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        calculationUsingSwitch();
    }

    public static void calculationUsingSwitch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter any operator like +,-,*,/ or % to perform that operation");
        String operator = scanner.next();
        switch (operator){
            case "+":
                System.out.println("Addition of the given two numbers is "+ (num1+num2));
                break;
            case "-":
                System.out.println("Subtraction of the given two numbers is "+ (num1-num2));
                break;
            case "*":
                System.out.println("Multiplication of the given two numbers is "+ (num1*num2));
                break;
            case "/":
                System.out.println("Division of the given two numbers is "+ (num1/num2));
                break;
            case "%":
                System.out.println("Module of the given two numbers is "+ (num1%num2));
                break;
            default:
                System.out.println("Enter a valid operator");
        }
    }
}
