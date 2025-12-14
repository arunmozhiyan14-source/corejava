package task15To24;

/*Task 21: Find Largest Number in an Array
  Use a for-each loop to find the maximum value in an array.
*/
public class LargestNumberInArray {

    public void largestNumberInTheArray() {
        int[] numbers = {100, 307, 705, 23, 10000, 0, 956,};
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The Largest number of this Array is " + max);
    }

    public static void main(String[] args) {
        LargestNumberInArray rVar = new LargestNumberInArray();
        rVar.largestNumberInTheArray();
    }

}
