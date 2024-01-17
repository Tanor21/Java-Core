package com.norcorp.collectionapi;

import java.util.*;

public class SetInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA SET ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Collection API :
           1 - Set
         */
        //Set<Integer> numbers = new HashSet<>(); //Without sorting values
        //Collection<Integer> numbers = new TreeSet<>(); //We can use Collection because set extends collection
        Set<Integer> numbers = new TreeSet<>(); //With sorting values
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(9);

        Iterator<Integer> values = numbers.iterator();


        System.out.println();
        // using Iterator to print values
        while (values.hasNext()) {
            System.out.println(values.next());
        }
//        for (int n : numbers) {
//            System.out.println(n);
//        }
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
