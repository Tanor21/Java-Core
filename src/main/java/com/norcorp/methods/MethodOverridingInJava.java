package com.norcorp.methods;

//here we declare parent class
class Vehicle {
    public void engine() {
        System.out.println("Vehicle engine");
    }
    public void fuelType() {
        System.out.println("Vehicle fueltype");
    }
}

//here we declare child class
class Car extends Vehicle {
    public void engine() {
        System.out.println("Car engine");
    }
    public void fuelType() {
        System.out.println("Car fueltype");
    }
}

public class MethodOverridingInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA METHOD OVERRIDING ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           With method overriding :
            The benefit of overriding is: ability to define a behavior that's specific to the subclass type,
            which means a subclass can implement a parent class method based on its requirement.
            In object-oriented terms, overriding means to override the functionality of an existing method.
            If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
            Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
            Method overriding is used for runtime polymorphism
            NB : Why can we not override static method?
            It is because the static method is bound with class whereas instance method is bound with an object.
            Static belongs to the class area, and an instance belongs to the heap area.
         */

        Vehicle vehicle = new Vehicle();
        Vehicle benz = new Car();

        System.out.println();
        vehicle.fuelType();
        benz.fuelType();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
