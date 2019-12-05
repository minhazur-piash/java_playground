package com.minhaz.java.dsa;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class QSort {

    public static void main(String[] args) {
        int[] numbers = new int[] {10, 1, 3, 2, 100};
        Arrays.stream(new QSort().quickSort(numbers)).forEach(System.out::println);
    }

    private int[] quickSort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int pivot = array[0];
        int[] less = findLessThanPivot(array, pivot);
        int[] great = findGreaterThanPivot(array, pivot);
        // return quickSort(less) + pivot + quickSort(great)
        return quickSortMerge(quickSort(less), pivot, quickSort(great));
    }

    private int[] findGreaterThanPivot(int[] array, int pivot) {
        return Arrays.stream(array)
                .filter(value -> value > pivot)
                .toArray();
    }

    private int[] findLessThanPivot(int[] array, int pivot) {
        return Arrays.stream(array)
                .filter(value -> value < pivot)
                .toArray();
    }

    // function to merge two arrays
    private static int[] quickSortMerge(int[] arr1, int pivot, int[] arr2) {
        int[] leftArray = mergeArraysAsStream(arr1, new int[]{pivot});
        return mergeArraysAsStream(leftArray, arr2);
    }

    // function to merge two arrays
    private static int[] mergeArraysAsStream(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    }

}
