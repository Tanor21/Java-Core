package com.norcorp.statickeyword;

class Mobil {
    String brand;
    int price;
    String network;
    static String name; //static variable

    // Instance Method
    public void show() {
        /*In non-static method you can use static variables (exp: our variable name)*/
        System.out.println(brand + " : " + price + " : " + name);
    }

    // Static Methode
    public static void show1(Mobil mobile) {
        System.out.println(mobile.brand + " : " + mobile.price + " : " + name);
    }
}

public class StaticMethodInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA STATIC METHOD ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            In Java, a static method is a method that belongs to the class, rather than an instance of the class.
            Static methods are accessed through the class name, rather than an object of the class.
         */

        // Mobile 1
        Mobil mobile1 = new Mobil();
        mobile1.brand = "Apple";
        mobile1.price = 10000;
        //mobile1.name = "SmartPhone";
        Mobil.name = "SmartPhone"; // Static variable should be call with the className not the object
        // Mobile 2
        Mobil mobile2 = new Mobil();
        mobile2.brand = "Samsung";
        mobile2.price = 8000;
        //mobile2.name = "SmartPhone";
        Mobil.name = "SmartPhone"; // Static variable should be call with the className not the object


        System.out.println();
        mobile1.show();
        mobile2.show();
        Mobil.show1(mobile1);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
