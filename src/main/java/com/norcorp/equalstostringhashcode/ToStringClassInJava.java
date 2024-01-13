package com.norcorp.equalstostringhashcode;

class Laptop {
    String model;
    int price;

    // If you don't have a method in your class it will call the method of the superclass.
    // But what if I create the method here itself :
    public String toString() {
        return model + " : " + price;
    }
}

public class ToStringClassInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA TOSTRING OBJECT CLASS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           ToString Class :

         */
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 7000;



        System.out.println();
        // NB: Everytime you try to print the object, by default behind the scene it will call toString() method even if you don't mention it.
        // obj.toString();
        System.out.println(obj);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
