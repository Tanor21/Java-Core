package com.norcorp.loop;

public class DoWhileLoopInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA DO WHILE LOOP ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Loops can execute a block of code as long as a specified condition is reached.
            Loops are handy because they save time, reduce errors, and they make code more readable.
         */

        // The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
        int i = 0;

        System.out.println();
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
