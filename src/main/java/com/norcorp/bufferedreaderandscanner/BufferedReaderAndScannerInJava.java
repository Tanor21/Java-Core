package com.norcorp.bufferedreaderandscanner;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderAndScannerInJava {
    public static void main(String[] args) throws IOException {
        System.out.println();
        System.out.println("==================================== ☕ JAVA BUFFERED READER AND SCANNER ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            BufferedReader And Scanner :

         */

        System.out.println("Enter a number ");

        // 1
        // int num = System.in.read();

        // 2
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println();
        System.out.println(num);
        //bf.close();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
