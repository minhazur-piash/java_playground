package com.minhaz.java.playground;

/**
 * Created by minhazur on 9/6/16.
 */
public class RecursiveSum {

    public static void main(String[] args) {
       System.out.print(recSum(5));
    }

    public static int recSum(int number) {

        if (number == 1) {
            return 1 ;
        }

        int sum = number + recSum(number - 1);
//        System.out.print(sum + " ");

        return sum;

    }
}
