package com.norcorp.accessmodifiers;


import com.norcorp.accessmodifiers.test.TestAccesOutsideThePackage;

class Test2 extends Test {
    public void abc() {
        System.out.println(age);
    }
}

public class AccesModifiersInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA ACCESS MODIFIERS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Access Modifiers :
           Access modifiers are object-oriented programming that is used to set the accessibility of classes,
           constructors, methods, and other members of Java.
           Using the access modifiers we can set the scope or accessibility of these classes, methods, constructors, and other members.
           JAVA has two types of modifiers: access modifiers and non-access modifiers.
           Public : It can be accessed from anywhere.
           Private : private variable can be use in the same class.
           Default : It can be acces in the same package.
           Protected : you can't access protected variable outside another package, but you can access it in a package subclass.
         */

        Test obj1 = new Test();
        TestAccesOutsideThePackage obj2 = new TestAccesOutsideThePackage();

        Test2 b = new Test2();

        System.out.println();
        System.out.println(obj1.marks1);
        b.abc();
        //System.out.println(obj2.marks2); //marks2 is not public, cannot be access from outside the package.
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
