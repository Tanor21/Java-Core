package com.norcorp.arrays;

public class JaggedANd3DArraysInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA JAGGED AND 3D ARRAYS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        int nums[][] = new int[3][]; //jagged array
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        System.out.println();
        for (int i =0; i<nums.length; i++) {
            for (int j = 0; j<nums[i].length; j++) {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }
        for (int n[]: nums) {
            for (int m: n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
