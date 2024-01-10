package com.norcorp.arrays;

public class MultidimensionalArraysInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA MULTIDIMENSIONAL ARRAYS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Multidimensional array is an array of arrays.
            Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.
         */
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int nums[][] = new int[3][4];

        System.out.println();
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
