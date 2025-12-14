package task15To24;

/*Task 23: Count Vowels in a Character Array
Input:
char[] letters = {'a', 'b', 'e', 'x', 'i', 'o'};
Count how many vowels exist using for-each loop.
*/
public class CountingTheVowels {
    char[] letters = {'a', 'b', 'e', 'x', 'i', 'o',};

    public static void main(String[] args) {
        CountingTheVowels vowels = new CountingTheVowels();
        vowels.CountTheVowels();
    }

    public void CountTheVowels() {
        int count = 0;
        for (char letter : letters) {
            switch (letter) {
                case 'a':
                    count = count + 1;
                    break;
                case 'e':
                    count = count + 1;
                    break;
                case 'i':
                    count = count + 1;
                    break;
                case 'o':
                    count = count + 1;
                    break;
                case 'u':
                    count = count + 1;
                    break;
            }
        }
        System.out.println("Total no of vowels in the array is " + count);
    }
}
