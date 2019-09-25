package com.minhaz.java.problemsolving.codingbat;


/**
 * Created by minhazur on 10/31/16.
 * http://codingbat.com/prob/p107330
 */

public class BunnyEars2 {
    public static void main(String[] args) {
        System.out.println(sumOfEars(0));
    }

    public static int sumOfEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }

        return getNoOfEars(bunnies) + sumOfEars(bunnies - 1);
    }

    public static int getNoOfEars(int n) {
        if (n % 2 == 0) {
            return 3;
        } else {
            return 2;
        }
    }
}
