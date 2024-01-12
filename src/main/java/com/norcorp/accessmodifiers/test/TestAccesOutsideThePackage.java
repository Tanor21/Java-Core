package com.norcorp.accessmodifiers.test;

import com.norcorp.accessmodifiers.Test;

public class TestAccesOutsideThePackage {

    int marks2 = 12;

    public void test2() {
        Test obj = new Test();
        //System.out.println(obj.age); // you can't access protected variable outside another package
    }
}
