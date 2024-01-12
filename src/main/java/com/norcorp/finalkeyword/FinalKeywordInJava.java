package com.norcorp.finalkeyword;

/*
    2- final keyword with class. When applied to a class, the final keyword indicates that the class cannot be subclassed.
    In other words, no other class can extend a final class.
*/
final class FinalClass {
    // Class definition
}

// Compilation error: Cannot inherit from final 'FinalClass'
// class Subclass extends FinalClass { }

class Calcule {
    // I don't want anyone to override my method, so to prevent method overriding make the method final
    public final void show() {
        System.out.println("In Calc Show");
    }
    public void add(int a, int b) {
        System.out.println(a+b);
    }
}

class AdvCalcule extends Calcule {
    // Error cannot override a final method
//    public void show() {
//        System.out.println("In AdvCalc Show");
//    }
}

public class FinalKeywordInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA DYNAMIC METHOD DISPATCH ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Final Keyword :
           can be use with -> variables, methods, class
         */

        // 1- final keyword with variable. to make a variable constant (can't change) we can use final
        final int num = 8;
        //num = 7; // Cannot assign a value to final variable

        // Test final class
        AdvCalcule obj = new AdvCalcule();


        System.out.println();
        //Print final variable
        System.out.println(num);
        //Print obj
        obj.show();
        obj.add(4, 5);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
