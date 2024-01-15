package com.norcorp.innerclass;

abstract class F {
    public abstract void show();
    public abstract void config();
}

public class AbstractAndAnonymousClassInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA ABSTRACT AND ANONYMOUS INNER CLASS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Abstract And Anonymous Inner Class :

         */

        // Anonymous Inner Class
        F obj = new F() {
            public void show(){
                System.out.println("In new show");
            }

            public void config() {
                System.out.println("In new config");
            }
        };

        System.out.println();
        obj.show();
        obj.config();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
