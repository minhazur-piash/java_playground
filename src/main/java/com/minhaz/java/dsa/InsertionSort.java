package com.minhaz.java.dsa;

import java.util.Arrays;

/**
 * Created by minhazur on 9/29/16.
 */

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5, 6};
        new InsertionSort().applyInsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void applyInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i;

            while (j > 0 && arr[j - 1] > value) {
                arr[j] = arr[j -1];
                j--;
            }
            arr[j] = value;
        }
    }
}
