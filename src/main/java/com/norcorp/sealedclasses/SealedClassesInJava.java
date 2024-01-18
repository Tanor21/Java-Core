package com.norcorp.sealedclasses;

// New keyword in java
// sealed class A
sealed class A permits B, C {

}
// non-sealed class B
non-sealed class B extends A {

}
// class C extends sealed class A
final class C extends A {

}
// class D extends non-sealed class B
class D extends B {

}

public class SealedClassesInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA SEALED CLASSES (JAVA 17 FEATURES) ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Sealed Classes :
         */



        System.out.println();

        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
