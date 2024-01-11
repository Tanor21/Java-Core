package com.norcorp.anonymousobject;

class C {

    public C() {
        System.out.println("Object Created");
    }
    public void show() {
        System.out.println("In A Show");
    }
}

public class AnonymousObjectInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA ANONYMOUS OBJECT ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Anonymous Object :

         */
        System.out.println();
        //new C().show(); This is the object creation at this moment you create an object and this king of object is call "anonymous object".
        C obj = new C(); //"reference object" because obj is the reference.


        System.out.println();
        obj.show();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
