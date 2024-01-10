package com.norcorp.string;

public class StringBufferAndStringBuilderInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA STRING BUFFER AND STRING BUILDER ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            StringBuffer and StringBuilder
            The difference is : StringBuffer is threadsafe and StringBuilder is not threadsafe
         */

        StringBuffer sb = new StringBuffer("Tanor");
        sb.append(" Cisse");

        sb.insert(5, " Java");

        //String str = sb; // cannot convert from StringBuffer to String so convert it from String : sb.toString().

        System.out.println();
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
