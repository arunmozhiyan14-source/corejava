package mediumLevelPrograms;

/*TASK 8: Attendance Checker (FOR + ENHANCED FOR)
Store attendance status (P / A) in an array
Use:
for loop → Count Present students
Enhanced for → Count Absent students
*/
public class AttendanceChecker {
    static char[] attendanceStatuses = {'P', 'A', 'P', 'P', 'P', 'A', 'P', 'P', 'A', 'P'};

    public static void main(String[] args) {
        countPresentStudents();
        countAbsentStudents();
    }

    public static void countPresentStudents() {
        int presentedCount = 0;
        for (int i = 0; i < attendanceStatuses.length; i++) {
            if (attendanceStatuses[i] == 'P') {
                presentedCount = presentedCount + 1;
            }
        }
        System.out.println("No of students Present " + presentedCount);
    }

    public static void countAbsentStudents() {
        int absentCount = 0;
        for (char attendanceStatus : attendanceStatuses) {
            if (attendanceStatus == 'A') {
                absentCount = absentCount + 1;
            }
        }
        System.out.println("No of students Absent " + absentCount);
    }
}


