package com.venkata.dhana.javasamples;

import java.util.Scanner;

/**
 * Created by suresh on 5/8/17.
 */
public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("enter a num");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibb1 = 1;
        int fibb2 = 1;

        System.out.println("first " + n + " fibonacci numbers are:");
        System.out.print(fibb1 + " " + fibb2);

        for (int i = 1; i <= n - 2; i++) {
            int current = fibb1 + fibb2;
            System.out.print(" " + current);
            fibb1 = fibb2;
            fibb2 = current;
        }
    }
}
