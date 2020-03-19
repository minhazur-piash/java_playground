package com.minhaz.java.certification;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int y = 4;
        double x = 3 + 2 * --y;


        System.out.println("x = " + x);

        int x1 = 4;
        // int[] arr = new int[-2];  // java.lang.NegativeArraySizeException

        Double number = Double.valueOf("120D");
        System.out.println("number = " + number);


        Long v = Long.parseLong ("ffffffffffffff", 16);

        System.out.println("args = " + (5381 & v));

    }
}