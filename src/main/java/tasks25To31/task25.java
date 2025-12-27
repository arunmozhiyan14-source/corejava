package tasks25To31;

public class task25 {
    public static void main(String[] args) {
        createAndPrintingAString();
        lengthOfTheString();
        changingTheCae();
        printingEachCharacters();
        printingEachChars();
        countingNoOfChars();
        comparingTwoStrings();
        ignoreCaseComparison();
        revesingAString();

    }

    /*Task 25: Create a String variable and print it.
     * Declare a String
     * Print it to the console
     */
    public static void createAndPrintingAString() {
        String name = "Arun";
        String fullName = new String("Arunmozhiyan");
        System.out.println("*************Task 25**************");
        System.out.println("name is : " + name);
        System.out.println("Fullname is : " + fullName);
    }

    /*Task 25.a: Find the length of a given String.
     * Use any built-in method
     * Print the length
     */
    public static void lengthOfTheString() {
        String name = "WELCOME TO THE JAVA WORLD!";
        System.out.println("*************Task 25.a**************");
        System.out.println("The length of the string " + name + " is " + name.length());
    }

    /*Task 25.b: Convert a String to uppercase and lowercase.
     * Print both outputs
     */
    public static void changingTheCae() {
        String name = "WELCOME TO THE JAVA WORLD!";
        System.out.println("*************Task 25.b**************");
        String nameUppercase = name.toUpperCase();
        String nameLowercase = name.toLowerCase();
        System.out.println(nameUppercase);
        System.out.println(nameLowercase);
    }

    /*Task 25.c: Print each character of a String using a loop.
     * Use `charAt()`
     */
    public static void printingEachCharacters() {
        String name = "WELCOME TO THE JAVA WORLD!";
        System.out.println("*************Task 25.c**************");
        for (int i = 0; i <= name.length() - 1; i++) {
            System.out.println(name.charAt(i));
        }
    }

    /*Task 25.d:  Print each character using `toCharArray()`.
     * Use enhanced for loop
     */
    public static void printingEachChars() {
        String name = "WELCOME TO THE JAVA WORLD!";
        System.out.println("*************Task 25.d**************");
        char[] ch = name.toCharArray();
        for (char c : ch) {
            System.out.println(c);
        }
    }

    /*Task 25.e: Count total number of characters (without using `length()`).
     * Use loop logic only
     */
    public static void countingNoOfChars() {
        String name = "WELCOME TO THE JAVA WORLD!";
        System.out.println("*************Task 25.e**************");
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            count += 1;
        }
        System.out.println("Total no of characters in the string " + name + " is " + count);
    }
    /*Task 25.f: Compare two Strings and check if they are equal.
     * Case-sensitive comparison
     */

    public static boolean comparingTwoStrings() {
        String name = "WELCOME TO THE JAVA WORLD!";
        System.out.println("*************Task 25.f**************");
        String name1 = "WELCOME TO THE PYTHON WORLD!";
        boolean isEqualorNot = name.equals(name1);
        System.out.println(isEqualorNot);
        return isEqualorNot;
    }

    /*Task 25.g: Compare two Strings ignoring case.
     * Use appropriate method
     */
    public static void ignoreCaseComparison() {
        String name = "WELCOME TO THE JAVA WORLD!";
        System.out.println("*************Task 25.g**************");
        String name1 = "WELCOME TO THE PYTHON WORLD!";
        boolean result = name.equalsIgnoreCase(name1);
        System.out.println(result);
    }

    /*Task 25.h: Reverse a String.
     * Print reversed String
     */
    public static void revesingAString() {
        String name = "WELCOME!";
        char[] n = name.toCharArray();
        System.out.println("*************Task 25.h**************");
        StringBuilder sb = new StringBuilder();
        for (int i = n.length - 1; i >= 0; i--) {
            sb.append(n[i]);
        }
        System.out.println(sb.toString().trim());
    }

}
