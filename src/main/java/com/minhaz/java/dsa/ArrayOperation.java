package com.minhaz.java.dsa;


import java.util.Arrays;

/**
 * Created by minhazur on 1/27/16.
 */
public class ArrayOperation {

    public static void main(String[] args){
       
        insertInOrderedArray();
    }


    static void insertInOrderedArray() {
        int[] orderedArray = new int[10];
        orderedArray[0] = 1;
        orderedArray[1] = 3;
        orderedArray[2] = 5;
        orderedArray[3] = 7;

        int noOfElements = 4;  //!!!This is important!!!

        int itemToInsert = 6;
        int insertIndex = 0;
        for (int i = 0; i < noOfElements; i++) {
            if (itemToInsert > orderedArray[i]) {
                insertIndex++;
            }
        }

        for (int j = noOfElements; j > insertIndex; j--) {
            orderedArray[j] = orderedArray[j - 1];
        }

        orderedArray[insertIndex] = itemToInsert;

        System.out.print(Arrays.toString(orderedArray));
    }
}
