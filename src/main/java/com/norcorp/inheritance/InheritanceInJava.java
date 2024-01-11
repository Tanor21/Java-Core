package com.norcorp.inheritance;

class PetAnimal {
    // field and method of the parent class
    String name;

    public void eat() {
        System.out.println("I can eat");
    }

}

// inherit from PetAnimal
class Dog extends  PetAnimal {

    // new method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }
}

public class InheritanceInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA INHERITANCE ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Inheritance :
            One object can acquire all of a parent object’s properties and actions through the technique of inheritance in Java Programming. I
            t is a crucial component of OOPs (Object Oriented programming system).
            In Java, the idea of inheritance means that new classes can be built on top of existing ones.
            When you derive from an existing class, you can use its methods and properties. To your current class,
            you may also add new fields and methods.

            The main advantage of inheritance is code reusability and also method overriding (runtime polymorphism).
            Inheritance is also known as the IS-A relationship.
         */

        // create an object of the subclass
        Dog labrador = new Dog();
        // access field of superclass
        labrador.name = "Athos";


        System.out.println();
        // access field of superclass
        labrador.display();
        // call method of superclass
        // using object of subclass
        labrador.eat();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
