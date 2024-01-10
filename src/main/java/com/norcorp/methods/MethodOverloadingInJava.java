package com.norcorp.methods;

class Calculator {
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class MethodOverloadingInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA METHOD OVERLOADING ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           With method overloading, multiple methods can have the same name with different parameters:
         */
        Calculator obj = new Calculator();
        int result = obj.add(5, 4, 9);

        System.out.println();
        System.out.println(result);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
