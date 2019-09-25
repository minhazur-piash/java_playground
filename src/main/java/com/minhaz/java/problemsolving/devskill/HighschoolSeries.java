package com.minhaz.java.problemsolving.devskill;

import java.util.Scanner;

/**
 * Created by minhazur on 10/7/16.
 */
public class HighschoolSeries {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int tc = 1; tc <= cases; tc++) {
            int nthTerm = scanner.nextInt();
            int sum = 0;

            for (int i = 1; i <= nthTerm; i++) {
                sum += i * i * i;
            }

            System.out.println("Case " + tc + ": " + sum);
        }

    }
}
