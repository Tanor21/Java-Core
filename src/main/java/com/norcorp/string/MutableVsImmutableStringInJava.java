package com.norcorp.string;

public class MutableVsImmutableStringInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA MUTABLE VS IMMUTABLE STRING ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Mutable (Change) vs Immutable (Unchange) String
            By default String are immutable, once you create an object you can not change it
         */

        String name ="tanor";
        name = name + " cisse"; // creating a new object with value "tanor cisse". So you're just changing the address not the data

        String s1 = "Tanor";
        String s2 = "Tanor";

        System.out.println();
        System.out.println("Hello " + name);
        System.out.println(s1 == s2);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
