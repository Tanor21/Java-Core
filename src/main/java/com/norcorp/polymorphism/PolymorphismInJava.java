package com.norcorp.polymorphism;

class Shapes {
    public void area() {
        System.out.println("The formula for area of ");
    }
}
class Triangle extends Shapes {
    public void area() {
        System.out.println("Triangle is ½ * base * height ");
    }
}
class Circle extends Shapes {
    public void area() {
        System.out.println("Circle is 3.14 * radius * radius ");
    }
}

public class PolymorphismInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA POLYMORPHISM ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Polymorphism :
           Polymorphism in Java is the task that performs a single action in different ways.
           Polymorphism occurs when there is inheritance, i.e., many classes are related.
           Compile (early binding) time polymorphism :
           If you define your behaviors at compile time.
           "Overloading" = add(int, int) ::: add(int, int, int) NB: which method to execute will be decided at compile time.
           Run time (late binding) polymorphism :
           If you define your behaviors at run time "Overriding"
           "Overriding" = class A with method add(int, int) extends class B with method add(int, int) NB: which method to execute will be decided at run time.
         */
        Shapes myShape = new Shapes();  // Create a Shapes object
        Shapes myTriangle = new Triangle();  // Create a Triangle object
        Shapes myCircle = new Circle();  // Create a Circle object


        System.out.println();
        myShape.area();
        myTriangle.area();
        myShape.area();
        myCircle.area();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
