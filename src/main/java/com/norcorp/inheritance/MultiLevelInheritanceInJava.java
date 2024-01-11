package com.norcorp.inheritance;

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvCalc extends Calc {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

class VeryAdvCalc extends AdvCalc {

    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class MultiLevelInheritanceInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA MULTI LEVEL INHERITANCE ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Multilevel Inheritance :
            In Multi-Level Inheritance in Java, a class extends to another class that is already extended from another class.
            For example, if there is a class A that extends class B and class B extends from another class C,
            then this scenario is known to follow Multi-level Inheritance.
            Here, the class Vehicle is the grandfather class. The class Car extends class Vehicle and the class SUV extends class Car.
            Calc ------> AdvCalc ------>VeryAdvCalc

         */
        //AdvCalc obj = new AdvCalc();
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        int r3 = obj.multi(5, 3);
        int r4 = obj.div(15, 4);



        System.out.println();
        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);
        System.out.println("R4 = " + r4);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
