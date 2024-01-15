package com.norcorp.interfaceneed;

/*abstract class Computer {
    public abstract void code();
}*/

interface Computer {
    int compNumber = 34;  //final or static
    String compName = "Lonovo";
    void code();
    void push();
}

interface Z {
    void run();
}

class Laptop implements Computer, Z {
    public void code() {
        System.out.println("code, compile, run");
    }
    public void push() {
        System.out.println("push the code on github");
    }
    public void run() {
        System.out.println("running...");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run : faster");
    }
    public void push() {
        System.out.println("push the code on the repository");
    }
}

class Developer {
    public void developApp(Computer computer) {
        computer.code();
        computer.push();
    }

    //public void finishCode()
}

public class InterfaceInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA INTERFACES ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Interface :
           Interface say I will tell you what are the method you need, but I will not implement them. It's your
           job to implement them.
           All the variables inside an interface are by default : final or static
           NB :
           class - class -> extends
           class - interface -> implements
           interface - interface -> extends

         */
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();

        Developer tanor = new Developer();

        System.out.println();
        tanor.developApp(lap);
        System.out.println("----------");
        // We acces static variable with the help of the className
        System.out.println(Computer.compName + " : " + Computer.compNumber);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
