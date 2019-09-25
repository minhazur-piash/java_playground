package com.minhaz.java.problemsolving.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by minhazur on 11/8/16.
 */
public class Duplicates {
    public static void main(String[] args) {
        int[] ar = {1, 3, 5, 2, 3, 6, 8, 2, 3, 3};
        List<Integer> duplicates = new ArrayList<>();
        Arrays.sort(ar);

        int count = 0;
        for(int i = 1; i < ar.length; i++) {
            if(ar[i] == ar[i - 1] && !duplicates.contains(ar[i - 1])) {
                count++;
                duplicates.add(ar[i - 1]);
            }
        }

        System.out.println(count);
    }
}
