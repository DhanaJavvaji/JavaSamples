package com.venkata.dhana.javasamples;


import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        System.out.println("enter 3 num");
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        if (i >= j && i >= k) {
            System.out.println("Result is " + i);
        } else if (j >= i && j >= k) {
            System.out.println("Result is " + j);
        } else if (k >= i && k >= j) {
            System.out.println("Result is " + k);
        } else {
            System.out.println("Invalid");
        }

    }


}