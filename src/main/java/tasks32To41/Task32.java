package tasks32To41;

/*Task 32: Stop on First Negative Number (BREAK + FOR)
Concept: for loop + break
Task:
Store integers in an array
Traverse the array using a for loop
Print numbers one by one
Stop execution immediately when a negative number is found
*/
public class Task32 {
    public static void main(String[] args) {
        StopOnFirstNegativeNumber();
    }

    public static void StopOnFirstNegativeNumber() {
        int[] numbers = {10, 25, 40, -5,-2};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println("Negative number found. Loop stopped.");
                break;
            }
            else
                System.out.println(numbers[i]);
        }
    }
}
