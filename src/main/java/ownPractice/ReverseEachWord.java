package ownPractice;

public class ReverseEachWord {
    public static void main(String[] args) {
        reverseTheWordsInSentence("hello world");
    }
    public static void reverseTheWordsInSentence(String str) {
        String[] words = str.split("\\s");
        StringBuilder sb = new StringBuilder();
        String reversedSentence = null;
        for (String word : words) {
            char[] ch = word.toCharArray();
            String rev = "";
            for (int i = ch.length - 1; i >= 0; i--) {
                rev += ch[i];
            }
            reversedSentence = sb.append(rev).append(" ").toString();
        }
        System.out.println(reversedSentence);


    }



    }

