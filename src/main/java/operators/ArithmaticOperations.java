package operators;

/*
Task 5
Write a Java program to: Take two numbers num1 = 9 and num2 = 10.
Create a method to Perform addition, subtraction, multiplication, division, and modulus operations.
Print the results of each operation.
*/
public class ArithmaticOperations {

    static int num1 = 9;
    static int num2 = 10;

    public static void basicArithmatics() {
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
        System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2));
        System.out.println("Modulus  of " + num1 + " and " + num2 + " is " + (num1 % num2));
    }

    public static void main(String[] args) {
        basicArithmatics();
    }
}
