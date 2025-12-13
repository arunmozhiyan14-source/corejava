package operators;

/*Task 12
Program: Classify temperature using if and if else statement
temperature greater than 40 print "It's Very Hot!"
temperature greater than 30 "It's Warm."
temperature greater than 20 "It's Pleasant."
temperature greater than 10 "It's Cool."
Other than that "It's Cold!"*/

public class IfElseIfConditions {
    static int temperature = 8;

    public static void climateStatus() {
        if (temperature > 40) {
            System.out.println("It's Very Hot!");
        } else if (temperature > 30) {
            System.out.println("It's Warm.");
        } else if (temperature > 20) {
            System.out.println("It's Pleasant.");
        }else if (temperature > 10) {
            System.out.println("It's Cool.");
        }else{
            System.out.println("It's Cold!");
        }
    }

    public static void main(String[] args) {
        climateStatus();
    }
}

