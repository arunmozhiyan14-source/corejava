package tasks32To41;
/*Task 38: Print Numbers Except Multiples of 3 (CONTINUE)
Concept: for + continue
Task:
Print numbers from 1 to 20
Skip numbers divisible by 3
Use continue statement
*/
public class Task38 {
    public static void main(String[] args) {
        printingNumbersExceptMultiplesOfThree();

    }
    public static void printingNumbersExceptMultiplesOfThree(){
        for(int i=0;i<=20;i++){
            if(i%3==0) continue;
            else System.out.print(i+ " ");
        }
    }
}
