package com.norcorp.streamapi;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapFilterReduceSortedInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA MAP REDUCE FILTER AND SORTED ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
        Function<Integer, Integer> func = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n*2;
            }
        };

        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n%2 == 0;
                /*if (n%2==0)
                    return true;
                else
                    return false;*/

            }
        };

        /*int result = nums.stream()
                .filter(p)
                .map(func)
                .reduce(0, (c, e) -> c+e);*/
        Stream<Integer> sortedValues = nums.stream()
                .filter(p)
                .sorted();


        System.out.println();
        //System.out.println(result);
        sortedValues.forEach(n -> System.out.println(n));
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
