package com.norcorp.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiExemple {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA STREAM API ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        /*Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0, (c, e) -> c+e);*/
        int result = nums.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*2)
                .reduce(0, (c, e) -> c+e);

        System.out.println();
        // Stream
        //s1.forEach(n -> System.out.println(n));
        // Stream with filter
        //s2.forEach(n -> System.out.println(n));
        System.out.println("---------");
        // Stream with map
        //s3.forEach(n -> System.out.println(n));
        // Stream in one line
        System.out.println(result);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
