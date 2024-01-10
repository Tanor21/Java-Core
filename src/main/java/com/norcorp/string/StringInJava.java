package com.norcorp.string;

public class StringInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA STRING ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            String :
            Strings are used for storing text.
            A String variable contains a collection of characters surrounded by double quotes:
         */
        String say = new String("Hello"); //Behind the chaine
        String name ="Tanor"; // Normal usage
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        System.out.println();
        System.out.println(say + " " + name);
        System.out.println(name.concat(" Dieng"));
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
