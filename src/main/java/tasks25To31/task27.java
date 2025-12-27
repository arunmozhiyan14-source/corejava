package tasks25To31;

/*Task 27: Replace all spaces with underscore (`_`).
 * Print modified String
 */
public class task27 {
    public static void main(String[] args) {
        replaceTheString("Welcome to the java World!");

    }

    public static void replaceTheString(String str) {
        String modifiedString = str.replace(" ", "_");
        System.out.println(modifiedString);
    }
}
