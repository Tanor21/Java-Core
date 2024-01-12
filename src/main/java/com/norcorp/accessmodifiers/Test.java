package com.norcorp.accessmodifiers;

class Launch {

    public void abc() {
        Test obj = new Test();
        //acces the protected variable
        System.out.println(obj.age);
    }
}

public class Test {
    int marks1 = 10;

    //private variable can be use in the same class.
    private String name = "Bruno";

    protected int age = 20;
}
