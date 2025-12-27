package tasks25To31;
/*Task 29: Check if a String contains a specific word.
 * Print FOUND or NOT FOUND
 */
public class task29 {
    public static void main(String[] args) {
        checkASpecificWord("Welcome to the java world!");
    }
    public static void checkASpecificWord(String str){
       boolean status = str.contains("java");
       if(status)
           System.out.println("FOUND");
       else
           System.out.println("NOT FOUND");
    }
}
