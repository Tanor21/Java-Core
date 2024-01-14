package com.norcorp.innerclass;

class G {
    public void show(){
        System.out.println("In A show");
    }
}

public class AnonymousInnerClassInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA ANONYMOUS INNER CLASS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Anonymous Inner Class : Class which doesn't have a name that is inside a class

         */

        // Anonymous Inner Class
        G obj = new G() {
            public void show(){
                System.out.println("In new show");
            }
        };

        System.out.println();
        obj.show();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
