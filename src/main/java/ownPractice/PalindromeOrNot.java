package ownPractice;

public class PalindromeOrNot {
    public static void main(String[] args) {
        checkPalindrome("MADAM");
        palindromeOrNot("VIKATAKAVI");
    }

    public static void checkPalindrome(String str) {
//        Approach 1 - using string
        char[] ch = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        if (rev.equals(str))
            System.out.println("The given string " + str + " is Palindrome");
        else
            System.out.println("The given string " + str + " is Not Palindrome");
    }

    public static void palindromeOrNot(String str){
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = ch.length - 1; i >= 0; i--){
            sb.append(ch[i]);
        }
        String reveresedString = sb.toString();
        if(str.equals(reveresedString))
            System.out.println("The given string " + str + " is Palindrome");
        else
            System.out.println("The given string " + str + " is Not Palindrome");
    }
}
