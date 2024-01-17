package com.norcorp.collectionapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA ARRAY LIST ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Collection API :
           1 - ArrayList


         */
        // Without indexValue
        //Collection<Integer> nums = new ArrayList<Integer>();
        // Without indexValue
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println();
        for (int n : nums) {
            System.out.println(n);
        }
        System.out.println("----");
        // test indexValue
        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(5));
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
