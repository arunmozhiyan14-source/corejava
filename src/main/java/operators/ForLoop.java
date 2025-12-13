package operators;
/*Task 13
Print numbers from 1 to 10
Print numbers from 10 to 1
Print even numbers from 1 to 50
Print odd numbers from 1 to 50*/

public class ForLoop {
    public static void oneToTen(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("******************");
    }
    public static void tenToOne(){
        for(int i=10;i>=1;i--){
            System.out.println(i);
        }
        System.out.println("******************");
    }
    public static void evenNumbers1to50() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("******************");
    }
    public static void oddNumbers1to50() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("******************");
    }
/* Task 14: Table Programs
14.1 Print the multiplication table of 5
14.5 Print multiplication table of any number given by the user  */

    public static void multiplicationOfFive() {
    for (int i = 1; i <= 50; i++) {
        if (i % 5 == 0) {
            System.out.println(i);
        }
    }
    System.out.println("********MULTI*****");
}
    public static void multiplicationOfany() {
        int num;
        for (int i = 1; i <= 100; i++) {
            num = 2;
            if (i % num == 0) {
                System.out.println(i);
            }
        }
        System.out.println("*******MULTI******");
    }


    public static void main(String[] args) {
        oneToTen();
        tenToOne();
        evenNumbers1to50();
        oddNumbers1to50();
        multiplicationOfFive();
        multiplicationOfany();
    }
}
