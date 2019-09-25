package com.minhaz.java.problemsolving.devskill;

import java.util.Scanner;

/**
 * Created by minhazur on 10/7/16.
 */
public class LoveAndFight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int tc = 1; tc <= cases; tc++) {

            long hits = scanner.nextLong();

           long diff = hits;
           for (long i = 1; i <= Math.sqrt(hits); i++) {
               if ( hits % i == 0) {
                   long min = Math.abs(i - (hits / i));

                   if (min < diff) {
                       diff = min;
                   }
               }
           }

            System.out.println(diff);
        }

    }
}
