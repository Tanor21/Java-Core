package com.norcorp.loop;

public class ForLoopInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA FOR LOOP ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Loops can execute a block of code as long as a specified condition is reached.
            Loops are handy because they save time, reduce errors, and they make code more readable.
         */

        // When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("-------");
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
