package com.norcorp.innerclass;

class A {
    int age;
    public void show() {
        System.out.println("In show");
    }

    class B {
        public void config() {
            System.out.println("In config");
        }
    }

    static class C {
        public void details() {
            System.out.println("In details");
        }
    }
}


public class InnerClassInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA INNER CLASS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Inner Class : Class inside a class

         */
        // Instantiate class A
        A obj = new A();

        // Instantiate inner class B
        A.B obj1 = obj.new B();

        // Instantiate inner class C
        A.C obj2 = new A.C();

        System.out.println();
        obj.show();
        obj1.config();
        obj2.details();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
