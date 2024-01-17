package com.norcorp.collectionapi;

import java.util.*;

public class MapInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA MAP ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Collection API :
           3 - Map
         */

        Map<String, Integer> students = new HashMap<>();
        students.put("Tanor", 56);
        students.put("Bruno", 23);
        students.put("John", 67);
        students.put("Haroune", 92);
        students.put("Bruno", 40);



        System.out.println();
        System.out.println(students);
        System.out.println(students.get("Bruno"));
        // print only key with keySet() method.
        System.out.println(students.keySet());
        // print only value with values() method.
        System.out.println(students.values());
        // print keys and values
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key
            ));
        }
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
