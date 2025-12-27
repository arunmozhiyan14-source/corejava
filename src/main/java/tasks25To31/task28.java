package tasks25To31;

/*Task 28: Remove all spaces from a String.
 * Print final output
 */
public class task28 {
    public static void main(String[] args) {
        removeSpecificElementInTheString("WELCOM TO THE JAVA WORLD !");

    }

    public static void removeSpecificElementInTheString(String str) {
        String modifiedString = str.replace(" ", "");
        System.out.println(modifiedString);
    }
}
