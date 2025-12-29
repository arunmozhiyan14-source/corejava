package ownPractice;

public class FirstLetterInCapital {
    public static void main(String[] args) {
        FirstLetterAsCapital("hello to java world!");
    }

    public static void FirstLetterAsCapital(String str){
        String[] words = str.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(Character.toUpperCase(word.charAt(0)));       //H
            sb.append(word.substring(1).toLowerCase());   //ello --> Hello
            sb.append(" ");                                         //Hello<space>
        }
        String convertedString = sb.toString();
        System.out.println(convertedString);
    }

}
