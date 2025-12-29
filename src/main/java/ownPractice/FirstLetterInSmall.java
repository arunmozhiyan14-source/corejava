package ownPractice;

public class FirstLetterInSmall {
    public static void main(String[] args) {
        firstLetterAsSmall("ARUN MOZHIYAN");
    }
    public static void firstLetterAsSmall(String str){
        String[] words = str.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(Character.toLowerCase(word.charAt(0)));
            sb.append(word.substring(1).toUpperCase());
            sb.append(" ");
        }
        String changedString = sb.toString();
        System.out.println(changedString);
    }

}
