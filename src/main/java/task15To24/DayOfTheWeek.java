package task15To24;

public class DayOfTheWeek {
/*Task 15 : Day of the Week
Write a program that takes a number (1–7) and prints the corresponding day using switch.
*/
    static int day = 10;

    public static void main(String[] args) {
        DayOfTheWeek day = new DayOfTheWeek();
        day.printingTheDayOfTheWeek();
    }

    public void printingTheDayOfTheWeek() {
        switch (day) {
            case 1:
                System.out.println("Day of the week is Monday");
            case 2:
                System.out.println("Day of the week is Tuesday");
            case 3:
                System.out.println("Day of the week is Wednesday");
            case 4:
                System.out.println("Day of the week is Thursday");
            case 5:
                System.out.println("Day of the week is Friday");
                break;
            case 6:
                System.out.println("Day of the week is Saturday");
            case 7:
                System.out.println("Day of the week is Sunday");
            default:
                System.out.println("Enter the number only from 1 to 7");
        }
    }
}





