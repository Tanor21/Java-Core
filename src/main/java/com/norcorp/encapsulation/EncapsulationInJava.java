package com.norcorp.encapsulation;

class Person {
    // NB : Everytime you create an instance variables make it private.
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA ENCAPSULATION ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Encapsulation :
            Encapsulation is defined as the wrapping or bundling up of data and methods of a class into a single unit.
            The fundamental concept of encapsulation is to hide the internal representation of an object from the outside.
            This is also known as data hiding. In general, encapsulation restricts the outer classes to access and modify the fields and methods of a class.
         */

        Person omar = new Person();

        // setting values of the variables
        omar.setName("Omar");
        omar.setAge(34);

        System.out.println();
        // Displaying values of the variables
        System.out.println(omar.getName() + " : " + omar.getAge());
        System.out.println();
        // Direct access of empID is not possible
        //System.out.println(omar.name);
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
