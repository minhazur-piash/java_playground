package com.minhaz.java.problemsolving.hackerEarth;

import java.util.Scanner;

/**
 * Created by minhazur on 9/4/16.
 */
public class OppositeTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for (int i = 1; i <= cases; i++) {
            int totalProblems = input.nextInt();
            int computer1 = 0;
            int computer2 = 0;

            if (totalProblems % 2 == 0) {
                computer1 = totalProblems / 2;
                computer2 = computer1;

            } else {
                computer1 = totalProblems / 2;
                computer2 = computer1 + 1;
            }

                System.out.println(computer1 + " " + computer2);
        }
    }
}
