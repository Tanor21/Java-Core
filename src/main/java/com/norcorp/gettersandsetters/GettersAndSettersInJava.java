package com.norcorp.gettersandsetters;

class Human {
    private int age;
    private String name;

    //Getter of age variable
    public int getAge() {
        return age;
    }

    //Setter of age variable
    public void setAge(int age) {
        this.age = age;
    }

    //Getter of name variable
    public String getName() {
        return name;
    }

    //Setter of name variable
    public void setName(String name) {
        this.name = name;
    }
}


public class GettersAndSettersInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA GETTERS AND SETTERS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Getters and Setters :
            Getters and Setters are the two conventional special class methods in Java used for retrieving and
            updating the private properties or variables of a class.
         */
        Human obj = new Human();
        // Call the setter on the object to set the value of variable name and the variable age.
        obj.setName("John");
        obj.setAge(30);

        System.out.println();
        // Call the getter on the object to get the value of variable name and the variable age.
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
