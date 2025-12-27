package tasks25To31;

/*Task 31:  Extract domain name from an email id.
**Example Input:**
`testuser@gmail.com`
**Expected Output:**
`gmail.com`
*/
public class task31 {
    public static void main(String[] args) {
        ExtractTheDomainName("testuser@gmail.com");

    }

    public static void ExtractTheDomainName(String str) {
        String domainName = str.substring(9);
        System.out.println(domainName);
    }
}
