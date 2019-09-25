package com.minhaz.java.playground;

import java.util.Arrays;

public class ArrayIncrement {

    static int[] a = {0,0};

    public static void main(String[] args) {

        add(1);
        System.out.println(Arrays.toString(a));
        add(1);
        System.out.println(Arrays.toString(a));
        add(1);
        System.out.println(Arrays.toString(a));

    }
    static void add(int i) {
        switch(i) {
            case 0:
                a[0]++;

            case 1:
                a[0]++;
                a[1]++;
        }
    }
}
