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
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA STATIC BLOCK ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            In Java, a static method is a method that belongs to the class, rather than an instance of the class.
            Static methods are accessed through the class name, rather than an object of the class.
         */

        // Mobile 1
        Mob mobile1 = new Mob();
        mobile1.brand = "Apple";
        mobile1.price = 10000;
        Mob.name = "SmartPhone";

        Mob mobile2 = new Mob();

        System.out.println();
        mobile1.show();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
