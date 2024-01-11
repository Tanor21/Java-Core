package com.norcorp.thisandsupermethod;

// Every class in java extends the Object class Even if you don't mention it is there.
/*class A extends Object {}*/
class A {
    public A() {
        super(); //the super class is the constructor of the object class.
        System.out.println("Constructor A");
    }

    public A(int n) {
        super(); //the super class is ?
        System.out.println("Constructor A int");
    }
}
class B extends A{

    public B() {
        //super(5); //the super class is A
        super();
        System.out.println("Constructor B");
    }

    public B(int n) {
        //super(n); //the super class is A
        this(); // this will be executed first and will call the constructor of the same class.
        System.out.println("Constructor B int");
    }
}

public class ThisAndSuperMethodInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA THIS AND SUPER METHOD ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            This and Super Method :
            Every constructor in java has a method which is there aven if you don't mention.
            And that method is super().
            super() method simply mean call the constructor of a superCLass.
            NB : It will call the default constructor not the parameterize constructor.
            What if I want to call the parameterize constructor ?
            To call the parameterize constructor, we can pass a value to super(n)

            This : this will execute the constructor of the same class
         */

        B obj = new B(5); //Calling the default constructor
        //B obj = new B(9); //Calling the parameterize constructor


        System.out.println();

        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
