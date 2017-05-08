package com.venkata.dhana.javasamples;

import java.util.Scanner;

/**
 * Created by suresh on 5/8/17.
 */
public class Factorial {


    public static void main(String[] args) {

        System.out.println("enter a num");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("factorial is " + fact);
    }
}
