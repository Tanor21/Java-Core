package com.norcorp.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApiInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA STREAM API ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Stream API :
         */
        //List<Integer> nums = new ArrayList<>();
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Consumer is a @Functional Interface so we can use LambdaExpression
        /*Consumer<Integer> cons = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };*/

        Consumer<Integer> cons = (Integer n) -> System.out.println(n); // LambdaExpression

        /*int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                n = n * 2;
                sum = sum + n;
            }
        }*/


        System.out.println();
        System.out.println(nums);
        //System.out.println(sum);
        System.out.println("---------");
        // forEach method
        nums.forEach(n -> System.out.println(n));
        System.out.println("--------");
        // forEach method with consumer
        nums.forEach(cons);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
