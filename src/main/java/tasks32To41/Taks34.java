package tasks32To41;

/*Task 34:Find First Multiple of 7 (WHILE + BREAK)
Concept: while loop + break
Task:
Start from number 1
Increment number using while loop
Find the first number divisible by 7
Print it and exit the loop
Output:
First multiple of 7 is: 7
*/
public class Taks34 {
    public static void main(String[] args) {
        FirstMultipleOfSeven();

    }

    public static void FirstMultipleOfSeven() {
        int i = 1;
        while (i!=0) {
            if(i%7==0) {
                System.out.println("First multiple of 7 is: " + i);
                continue;
            }
            i++;
        }


    }
}
