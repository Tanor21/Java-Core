package com.norcorp.interfaceneed;

@FunctionalInterface
interface A {
    void show();
}

class B implements A {
    @Override
    public void show() {
        System.out.println("in B show");
    }
}

public class FunctionalInterfaceInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA FUNCTIONAL INTERFACE (NEW) ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Functional Interface :
           In Java, a functional interface is an interface that contains only one abstract method.
           Functional interfaces are also known as Single Abstract Method (SAM) interfaces.
           The concept of functional interfaces was introduced in Java 8 to support the functional
           programming paradigm and the use of lambda expressions.
         */
        A obj = new A() {
            public void show() {
                System.out.println("in B show");
            }
        };


        System.out.println();
        obj.show();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
