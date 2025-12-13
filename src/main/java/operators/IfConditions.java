package operators;
/*Task 10 - Write a program to check if a person is eligible for:
10.1 Voting (age ≥ 18)  Print - Eligible / Not Eligible
10.2 Driving license (age ≥ 18) Print - Drive / Not Drive*/

public class IfConditions {
    static int age = 15;
    public static void votingEligibility(){
        if(age >= 18) {
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
    public static void drivingLicense(){
        if(age >= 18) {
            System.out.println("Drive");
        }else{
            System.out.println("Not Drive");
        }
    }
/*Task 11 Program: Find the larger of two numbers using if else statement*/
    public static void largeNumber(){
        int num1=100;
        int num2=101;
        if(num1>num2){
            System.out.println(num1 +" is greater than "+ num2);
        }
        else{
            System.out.println(num2 +" is greater than "+ num1);
        }
    }

    public static void main(String[] args) {
        votingEligibility();
        drivingLicense();
        largeNumber();
    }
}
