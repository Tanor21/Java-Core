package com.norcorp.operators;

public class RelationalOperatorsInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA RELATIONAL OPERATORS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Relational Operators in Java are used to comparing two variables for equality, non-equality, greater than,
            less than, etc. Java relational operator always returns a boolean value - true or false.
            (==), (!=), (<), (>), (<=), (>=)
         */
        int a = 10;
        int b = 20;

        System.out.println();
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println("-----");
        // objects support == and != operators
        // System.out.println(new Data1() == new Data1());
        // System.out.println(new Data1() != new Data1());
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
