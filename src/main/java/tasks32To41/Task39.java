package tasks32To41;

import java.util.Scanner;

/*Task 39: Search Employee Name (BREAK + STRING)
Concept: for + break + String
Task:
Store employee names in a String array
Take input from user
Search for the name
If found:
Print "Employee Found"
Stop loop using break
If not found:
Print "Employee Not Found"
*/
public class Task39 {
    public static void main(String[] args) {
        String[] employeeNames = {"Arun", "Anand", "Kathiravan", "Vijay", "Vignesh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to check in employee List");
        String givenName = sc.next();
        System.out.println(employeeNames.length);
        boolean found = false;
        for (int i = 0; i <= employeeNames.length - 1; i++) {
            if (givenName.equalsIgnoreCase(employeeNames[i])) {
                System.out.println("Found");
                found = true;
                break;
            }
            }
        if (!found) {
            System.out.println("Employee Not Found");
        }
    }}


