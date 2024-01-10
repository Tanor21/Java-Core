package com.norcorp.statickeyword;

class Mobile {
    String brand;
    int price;
    String network;
    static String name; //static variable

    public void show() {
        /*In non-static method you can use static variables (exp: our variable name)*/
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticKeywordInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA STATIC VARIABLE ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Static Keyword :
            The static keyword is a non-access modifier used for methods and attributes. Static methods/attributes
            can be accessed without creating an object of a class.
            NB: static mean you are making something as a class member not an object member
         */
        // Mobile 1
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 5000;
        //mobile1.name = "SmartPhone";
        Mobile.name = "SmartPhone"; // Static variable should be call with the className not the object
        // Mobile 2
        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 3500;
        //mobile2.name = "SmartPhone";
        Mobile.name = "SmartPhone"; // Static variable should be call with the className not the object

        //mobile1.name = "Phone"; // It will change name for all the objects created because the variable name is static.

        System.out.println();
        mobile1.show();
        mobile2.show();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
