package operators;
/*Task 6 - Check whether a number is greater than, less than, or equal to 50.
(Hint You have to declare two number one is any number you wish to give and other one will be 50)*/

public class RelationalOperations {

    public static void main(String[] args) {
        int a, b;
        a = 49;
        b = 50;
        System.out.println("****************Task 6****************");
        if (a > b) {
            System.out.println("The number " + a + " is greater than " + b);
        } else if (a < b) {
            System.out.println("The number " + a + " is less than " + b);
        } else if (a == b) {
            System.out.println("The number " + a + " is equal to " + b);
        }
        RelationalOperations task7 = new RelationalOperations();
        task7.signCheck();
    }
    /*Task 7 - Check if a number is positive, negative, or zero (using relational operators).*/

    static int x = 0;

    public void signCheck() {
        System.out.println("****************Task 7****************");
        if (x > 0) {
            System.out.println("The number " + x + " is Positive.");
        } else if (x < 0) {
            System.out.println("The number " + x + " is Negative.");
        } else if (x == 0) {
            System.out.println("The number " + x + " is Zero.");
        }
    }
}