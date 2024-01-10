package com.norcorp.classnobject;

class Calculator {
    public int add(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;
        return result;
    }
}

public class ClassAndObjectInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA CLASS AND OBJECT ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        int num1 = 5;
        int num2 = 4;

        Calculator obj = new Calculator();
        int result = obj.add(num1, num2);

        System.out.println();
        System.out.println(result);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
