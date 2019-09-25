package com.minhaz.java.dsa;

/**
 * Created by minhazur on 10/1/16.
 */
public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 40, 60, 65, 88, 99, 100};
        new RecursiveBinarySearch().binarySearch(arr, 0, arr.length - 1, 999);
    }

    /**
     * bad choice. Do not use recursive binary search to search element or index as it has unnecessary overhead.
     * Like call backs, array passing.
     * @param arr
     * @param lowerBound
     * @param upperBound
     * @param target
     */
    public void binarySearch(int[] arr, int lowerBound, int upperBound, int target) {
        if (upperBound < lowerBound) {
            System.out.println("not found ");
            return;

        } else {
            int midIndex = (lowerBound + upperBound) / 2;
            int midValue = arr[midIndex];
            if (midValue == target) {
                System.out.println("found ");
                return;

            } else if (target < midIndex) {
                binarySearch(arr, lowerBound, midIndex - 1, target);
                System.out.print("control returned ");

            } else {
                binarySearch(arr, midIndex + 1, upperBound, target);
                System.out.print("control returned ");
            }
        }
    }
}
