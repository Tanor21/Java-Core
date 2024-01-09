package com.norcorp.typeconversion;

public class TypeConversionInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA TYPE CONVERSION ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Type conversion, also known as type casting,
            in Java refers to the process of converting a value from one data type to another.
            In Java, there are two types of type conversion:
         */

        // 1 - implicit Type Conversion (Widening) :
        int intValue = 42;
        long longValue = intValue; // Implicit conversion from int to long

        // 2 - Explicit Type Conversion (Narrowing) :
        double doubleValue = 3.14;
        int intVal = (int) doubleValue; // Explicit conversion from double to int




        System.out.println();
        System.out.println(longValue);
        System.out.println(intVal);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
