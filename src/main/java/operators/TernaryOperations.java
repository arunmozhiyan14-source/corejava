package operators;

public class TernaryOperations {

    public static void main(String[] args) {
        TernaryOperations task8 = new TernaryOperations();
        task8.maxNumber();
        TernaryOperations task9 = new TernaryOperations();
        task9.oddOrEven();
    }
    /*Task 8 - Find maximum of two numbers using ternary.*/
    public void maxNumber(){
        int num1 = 100;
        int num2 = 101;

        String maxNumber = (num1>num2) ? "num1 is the maximum number":"num2 is the maximum number";
        System.out.println(maxNumber);
    }
    /*Task 9 - Check if a number is even or odd using ternary*/
    public void oddOrEven(){{
    int num1 = 7;
    String oddOrEven = (num1%2==0) ? "Even Number":"Odd Number";
        System.out.println("The number "+num1 + " is "+ oddOrEven );
    }
    }


}
