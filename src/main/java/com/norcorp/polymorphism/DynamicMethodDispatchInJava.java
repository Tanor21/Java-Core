package com.norcorp.polymorphism;

//Dynamic Method Dispatch ou Run time polymorphism

class Animals {
    public void eat() {
        System.out.println("Animals Eat");
    }
}

class Herbivores extends Animals{
    public void eat(){
        System.out.println("Herbivores Eat Plants");
    }
}
class Omnivores extends Animals{
    public void eat(){
        System.out.println("Omnivores Eat Plants and meat");
    }
}

public class DynamicMethodDispatchInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA DYNAMIC METHOD DISPATCH ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Dynamic Method Dispatch :
           Dynamic Method Dispatch in Java is a mechanism by which a call to an overridden method is resolved at runtime
           rather than compile time. This allows objects of different classes to be treated as objects of a common
           superclass during method invocation, and the actual method to be called is determined at runtime based on
           the actual type of the object.
         */

        Animals obj = new Animals();


        System.out.println();

        obj.eat();
        obj = new Herbivores();
        obj.eat();
        obj = new Omnivores();
        obj.eat();

        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
