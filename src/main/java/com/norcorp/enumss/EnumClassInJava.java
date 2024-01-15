package com.norcorp.enumss;

enum Laptop {
    Macbook(2000), XPS(2200), Thinkpad(1500), Lenovo, Window(2500);

    private int price;

    Laptop() {
        price = 500;
    }

    Laptop(int price) {
        this.price = price;
        System.out.println("in laptop" + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClassInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA ENUMS CLASS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Enums :
           In Java, an enum (short for enumeration) is a special data type that represents a set of predefined constants or values.

         */
        Laptop laptop = Laptop.Macbook;


        System.out.println();
        System.out.println(laptop + " : " + laptop.getPrice());
        System.out.println("-------");
        for (Laptop lap: Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
