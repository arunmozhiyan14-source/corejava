package tasks25To31;
/*Task 26: Count vowels in a String.
 * Count both uppercase & lowercase vowels
 */
public class task26 {
    public static void main(String[] args) {
        countingTheVowels("ArUnmozhiyan");
    }
    public static void countingTheVowels(String str){
      char[] ch = str.toCharArray();
      int count = 0;
      for(int i =0;i<ch.length-1;i++){
          switch (ch[i]){
              case 'a': count += 1; break;
              case 'e': count += 1; break;
              case 'i': count += 1; break;
              case 'o': count += 1; break;
              case 'u': count += 1; break;
              case 'A': count += 1; break;
              case 'E': count += 1; break;
              case 'I': count += 1; break;
              case 'O': count += 1; break;
              case 'U': count += 1; break;
          }
      }
        System.out.println("Total No of vowels in the given string is " + count);
    }
}
