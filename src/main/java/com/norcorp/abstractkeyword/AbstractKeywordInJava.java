package com.norcorp.abstractkeyword;

abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing music...");
    }
}

class Bmw extends Car {
    public void drive() {
        System.out.println("Driving...");
    }
}

public class AbstractKeywordInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA ABSTRACT ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Abstract Keyword :
         */
        Car obj = new Bmw();


        System.out.println();
        obj.drive();
        obj.playMusic();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
