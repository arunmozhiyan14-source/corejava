package mediumLevelPrograms;

/*TASK 5: Number Analyzer (All Loop Types)
Use different loop types for different checks
Store numbers in an integer array
Use:
for loop → Count even numbers
enhanced for loop → Count odd numbers
while loop → Find sum of numbers
do-while loop → Print all numbers
*/
public class NumberAnalyzer {
    static int[] numbers = {190, 180, 187, 192, 190, 185};
    public static void main(String[] args) {
        countEvenNumbers();
        countOddNumbers();
        sumOfNumbers();
        printTheNumbers();
    }

//Counting even numbers using for loop

    public static void countEvenNumbers() {
        System.out.println("The even numbers are");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println("********************************");
    }

    //Counting odd numbers using enhanced for loop

    public static void countOddNumbers() {
        System.out.println("The odd numbers are");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
        System.out.println("********************************");
    }

    //Finding sum of numbers using while loop
    public static void sumOfNumbers() {
        int i = 0;
        int sum = 0;
        while (i < numbers.length) {
            sum = sum + numbers[i];
            i++;
        }
        System.out.println("The sum of the numbers is " + sum);
        System.out.println("********************************");
    }

    //    Printing all the numbers using do - while loop
    public static void printTheNumbers() {
        int i = 0;
        System.out.println("The numbers in the Array are");
        do {
            System.out.println(numbers[i]);
            i++;
        } while (i < numbers.length);
        System.out.println("********************************");
    }
}
