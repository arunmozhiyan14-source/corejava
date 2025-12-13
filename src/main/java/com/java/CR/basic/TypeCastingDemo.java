package com.java.CR.basic;

public class TypeCastingDemo {
    /*Task 3
    1.Create a package com.java.CR.basic
    2.Create a class name TypeCastingDemo
    3.Create a instance variable smallNumber type as int
    4.Create a instance variable bigNumber type as double and try to assign the bigNumber value to smallNumber variable
    */
    int smallNumber;
    double bigNumber = 100.999;

    public static void main(String[] args) {
        /*Task 3*/
        TypeCastingDemo rVar = new TypeCastingDemo();
        rVar.smallNumber = (int) rVar.bigNumber;
        System.out.println(rVar.smallNumber);
        /*Task 4*/
        TypeCastingDemo tCast = new TypeCastingDemo();
        tCast.typeCasting();
    }

    /*Task 4
    1.Create a package com.java.CR.basic
    2.Create a class name TypeCastingDemo
    3.Create a instance variable pi type as double value as 3.14159
    4.Create a instance variable approxPi type as int and try to assign the pi value to approxPi variable
    */
    double pi = 3.14159;
    int approxPi;

    public void typeCasting() {
        approxPi = (int) pi;
        System.out.println(approxPi);
    }
}