package com.venkata.dhana.javasamples;

import java.util.Scanner;

/**
 * Created by suresh on 5/8/17.
 */
public class MaxOfN {

    public static void main(String[] args) {

        System.out.println("enter how many nums");

        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

        System.out.println("enter a num");

         int curmax = sc.nextInt();

         for(int i = 1; i < n ;i++){


             System.out.println("enter num");
             int j = sc.nextInt();
             if(j >= curmax){
                 curmax = j;

             }

         }
        System.out.println(" Maximum num is "  + curmax );


    }

    }
