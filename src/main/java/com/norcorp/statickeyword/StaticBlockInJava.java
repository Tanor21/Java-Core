package com.norcorp.statickeyword;

class Mob {
    String brand;
    int price;
    String network;
    static String name; //static variable

    //static block
    static {
        name = "Phone";
        System.out.println("In static block");
    }

    //constructor
    public Mob(){
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    // Instance Method
    public void show() {
        /*In non-static method you can use static variables (exp: our variable name)*/
        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class StaticBlockInJava {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println();
        System.out.println("==================================== ☕ JAVA STATIC BLOCK ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            In Java, a static block is a block of code enclosed within curly braces and preceded by the static keyword.
            This block of code is part of a class and is executed when the class is loaded into the Java Virtual Machine (JVM).
            It is executed only once, before any instance of the class is created or any static member of the class is accessed.
         */

        // This is how to load a class.
        //Class.forName("com.norcorp.statickeyword.Mob");

        // Mobile 1
        Mob mobile1 = new Mob();
        mobile1.brand = "Apple";
        mobile1.price = 10000;
        Mob.name = "SmartPhone";

        System.out.println();
        //mobile1.show();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
