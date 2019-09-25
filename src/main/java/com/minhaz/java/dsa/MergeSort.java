package com.minhaz.java.dsa;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 100, 10, 9, 20, 35, 55, 56, 300, -1};
        /*for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();*/

        mergeSort(0, array.length - 1, array);

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }


    private static void mergeSort(int startIndex, int endIndex, int[] array) {
        if (startIndex == endIndex) {
            return;

        } else {
            int midIndex = (startIndex + endIndex) / 2;
            mergeSort(startIndex, midIndex, array);
            mergeSort(midIndex + 1, endIndex, array);
            merger(startIndex, midIndex + 1, endIndex, array);
        }
    }

    private static void merger(int startIndex, int midIndex, int endIndex, int[] array) {
        int tempArrayLength = (endIndex - startIndex) + 1;
        int[] tempArray = new int[tempArrayLength];

        int start = startIndex;
        int mid = midIndex;
        int end = endIndex;

        int i;
        for (i = 0; i < tempArrayLength; i++) {

            if (start >= midIndex || mid > end) {
                break;
            }

            if (array[start] > array[mid]) {
                tempArray[i] = array[mid];
                mid++;

            } else {
                tempArray[i] = array[start];
                start++;
            }
        }

        for (int j = start; j <= midIndex - 1; j++) {
            tempArray[i++] = array[j];
        }

        for (int j = mid; j <= end; j++) {
            tempArray[i++] = array[j];
        }


        for (int j = 0; j < tempArrayLength; j++) {
            array[startIndex + j] = tempArray[j];
        }
    }
}
