package com.minhaz.java.playground;

import edu.princeton.cs.algs4.StdRandom;

public class RandomTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 60; i++) {
            int val1 = StdRandom.uniform(1, 10);
            int val2 = StdRandom.uniform(1, 10);
            System.out.println("row " + val1 + " col " + val2);
        }
    }
}
