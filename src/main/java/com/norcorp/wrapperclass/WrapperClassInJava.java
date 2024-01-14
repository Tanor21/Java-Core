package com.norcorp.wrapperclass;


public class WrapperClassInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA WRAPPER CLASS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Wrapper Class :
           Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
           To create a wrapper object, use the wrapper class instead of the primitive type. To get the value, you can just print the object:
         */

        int num = 7;
        Integer num1 = num; // Autoboxing

        int num2 = num1; // auto-unboxing

        Integer myInt = new Integer(9); // boxing


        //Integer myInt = 9;
        Double myDouble = 5.99;
        Character myChar = 'A';

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println();
        System.out.println(num2);
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        System.out.println(num3*2);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
