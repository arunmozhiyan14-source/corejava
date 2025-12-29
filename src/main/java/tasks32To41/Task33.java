package tasks32To41;

/*Task 33: Skip Absent Students (CONTINUE + ENHANCED FOR)
Concept: enhanced for + continue
Task:
Store attendance status (P / A) in an array
Use enhanced for loop
If status is A, skip printing
Print only Present students count
Condition:
Use continue when student is absent
*/
public class Task33 {
    public static void main(String[] args) {
        SkipAbsentStudents();

    }

    public static void SkipAbsentStudents() {
        char[] attendanceStatus = {'P', 'P', 'P', 'A', 'P', 'P', 'P', 'A', 'P', 'P', 'P', 'A',};
        int count = 0;
        for (char a : attendanceStatus) {
            if (a == 'A') {
            }
            else
                count += 1;
        }
        System.out.println("Total No students present is " + count);
    }
}


