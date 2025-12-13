package task15To24;

import java.util.Scanner;

public class FactorialOfNumber {

    public static void factorialofanynumber(int n){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter any number to find its factorial");
//        int num = scanner.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(n + "! is "+ fact );
    }
    public static void main(String[] args) {
        factorialofanynumber(5);
    }
}
