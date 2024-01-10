package com.norcorp.methods;

class Computer {
    public void playMusic() {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}

public class MethodsInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA METHODS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            A method is a block of code which only runs when it is called.
            You can pass data, known as parameters, into a method.
            Methods are used to perform certain actions, and they are also known as functions.
            Why use methods? To reuse code: define the code once, and use it many times.
         */

        Computer obj = new Computer();
        String str = obj.getMeAPen(10);

        System.out.println();
        obj.playMusic();
        System.out.println(str);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
