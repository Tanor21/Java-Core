package com.norcorp.annotationss;

// Another annotation exemple used with classes :
// @Deprecated
class M {
    public void show() {
        System.out.println("in A show");
    }
}

class N extends M {
    // annotation @override
    @Override
    public void show() {
        System.out.println("in N show");
    }
}

public class AnnotationInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA ANNOTATION ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Annotation :
           In Java, annotations provide a way to add metadata, information, or markers to Java code elements (such as classes, methods, fields, etc.).
         */
        N obj = new N();

        System.out.println();
        obj.show();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
