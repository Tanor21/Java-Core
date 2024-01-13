package com.norcorp.upcastinganddowncasting;

class X {
    public void show1() {
        System.out.println("In X Show");
    }
}

class Y extends X {
    public void show2() {
        System.out.println("In Y Show");
    }
}

public class UpCastingAndDownCastingInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA UPCASTING AND DOWNCASTING ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Upcasting and Downcasting : In general it is called TypeCasting
         */

        // TypeCasting exemple
        double d = 4.5;
        int i = (int) d;

        // This concept here is calling Upcasting
        // we create an object of Y, but we say refer to X we are going Up
        // X obj = (X) new Y();
        X obj = new Y();
        obj.show1();

        // This concept here is calling Downcasting
        Y obj1 = (Y) obj;
        obj1.show2();


        System.out.println();

        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
