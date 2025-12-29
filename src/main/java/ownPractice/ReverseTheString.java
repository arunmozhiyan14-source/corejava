package ownPractice;

public class ReverseTheString {

//    Approach 1 - using string class
    public static String reverseAString(String str){
        char[] ch = str.toCharArray();
        String rev = "";
        for(int i = ch.length-1;i>=0;i--){
            rev += ch[i];
        }
        return rev;
    }

//    Approach 2 - using StringBuilder
    public static void stringReversalusingSB(String str){
        StringBuilder sb = new StringBuilder();
        char[] strInCh = str.toCharArray();
        for(int i = strInCh.length-1;i>=0;i--){
            sb.append(strInCh[i]);
        }
        String yourReversedString =  sb.toString();
        System.out.println(yourReversedString);
    }

    public static void main(String[] args) {
        String reveresedString = reverseAString("Arunmozhiyan");
        System.out.println(reveresedString);
        stringReversalusingSB("Ashraf Hanifa");
    }




}
