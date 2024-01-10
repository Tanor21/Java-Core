package com.norcorp.arrays;

public class ArraysInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA ARRAYS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
         */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        System.out.println();

        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("--------");
        for (int num : myNum) {
            System.out.println(num);
        }
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
