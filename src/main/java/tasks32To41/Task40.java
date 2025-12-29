package tasks32To41;

/*Task 40: Exam Evaluation System (BREAK + CONTINUE)
Concept: mixed control statements
Task:
Store marks of students in an array
Rules:
If marks < 0 → Invalid, stop loop (break)
If marks < 35 → Fail, skip grading (continue)
Else → Print Pass
Count number of passed students
*/
public class Task40 {
    public static void main(String[] args) {
        int[] marks = {98, 45, 35, 100, 27, 18, -7};
        int count = 0;
        for (int i = 0; i <= marks.length - 1; i++) {
            if (0 > marks[i]) {
                System.out.println("Invalid");
                break;
            } else if (marks[i] < 35) {
                continue;
            } else {
                System.out.println("Pass");
                count += 1;
            }
        }
        System.out.println("Total passed student is " + count);
    }
}
