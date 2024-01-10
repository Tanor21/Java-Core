package com.norcorp.loop;

public class ForEachLoopInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA FOR EACH LOOP ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Loops can execute a block of code as long as a specified condition is reached.
            Loops are handy because they save time, reduce errors, and they make code more readable.
         */

        // There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println();
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
