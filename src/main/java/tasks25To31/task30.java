package tasks25To31;

/*Task 30:Extract username from an email id.
**Example Input:**
`testuser@gmail.com`
**Expected Output:**
* `testuser`
*/
public class task30 {
    public static void main(String[] args) {
        extractSpecificElement("testuser@gmail.com");

    }

    public static void extractSpecificElement(String str) {
        String userName = str.substring(0, 8);
        System.out.println(userName);
    }
}
