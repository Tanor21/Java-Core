package com.norcorp.bufferedreaderandscanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryWithRessourceInJava {
    public static void main(String[] args) throws IOException {
        System.out.println();
        System.out.println("==================================== ☕ JAVA TRY WITH RESSOURCES ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Try With Ressources In Java :
         */
        int num = 0;

        // Close the ressource (br) automatically
        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
           ;
            num = Integer.parseInt(br.readLine());
        }



        System.out.println();
        System.out.println(num);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
