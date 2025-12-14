package task15To24;

/*Task 22: Sum of All Elements
Given an array of numbers → sum them using enhanced for loop.
*/
public class SumOfAllElements {
    int[] numbers = {100, 200, 300, 400, 500};

    public static void main(String[] args) {
        SumOfAllElements sum = new SumOfAllElements();
        sum.sumOfAllTheElements();
    }

    public void sumOfAllTheElements() {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println("The sum of the Array is " + sum);
    }
}
