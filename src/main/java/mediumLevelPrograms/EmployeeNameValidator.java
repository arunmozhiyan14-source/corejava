package mediumLevelPrograms;

/*TASK 2: Employee Name Validator (Enhanced For Loop)
Use only Enhanced for (for-each) loop
Store employee names in a String array
Check each name:
Must contain at least 5 characters
Print:
Valid names
Invalid names separately
*/
public class EmployeeNameValidator {

    static String[] employeeNames = {"Arun", "Anand", "Kathiravan", "Vijay", "Siva", "Raj"};

    public static void employeeNameValidation() {
        for (String employeeName : employeeNames) {
            if (employeeName.length() >= 5) {
                System.out.println(employeeName + " is Valid Name");
            } else {
                System.out.println(employeeName + " is Invalid name");
            }

        }

    }

    public static void main(String[] args) {
        employeeNameValidation();
    }

}
