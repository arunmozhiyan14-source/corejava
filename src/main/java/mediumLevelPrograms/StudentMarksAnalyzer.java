package mediumLevelPrograms;

/*TASK 1: Student Marks Analyzer (FOR Loop)
Use only for loop
Store marks of 5 students in an array
Calculate:
Total marks
Average marks
Print:
Highest mark
Lowest mark
Condition:
If average ≥ 50 → Print Pass
Else → Print Fail
*/
public class StudentMarksAnalyzer {

    public static void main(String[] args) {
        analyzeTheMarks();
    }

    public static void analyzeTheMarks() {
        int[] marks = {98, 92, 99, 98, 100};
        int total = 0;

        /*Calculating the total marks*/
        for (int i = 0; i <= marks.length - 1; i++) {
            total = total + marks[i];
        }
        System.out.println("The Total Mark is " + total);

        /*Calculating the average mark*/
        double average = (double) total / (marks.length);
        System.out.println("The Average Mark is " + average);

        /*Printing the result*/
        if (average >= 50) {
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }

        /*Printing the Highest Mark*/
        int highest = marks[0];
        for (int i = 0; i <= marks.length - 1; i++) {
            if (highest < marks[i]) {
                highest = marks[i];
            }
        }
        System.out.println("The Highest Mark is: " + highest);


        /*Printing the Lowest Mark*/
        int lowest = marks[0];
        for (int i = 0; i <= marks.length - 1; i++) {
            if (lowest > marks[i]) {
                lowest = marks[i];
            }
        }
        System.out.println("The Lowest Mark is: " + lowest);
    }
}
