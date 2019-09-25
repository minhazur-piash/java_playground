package com.minhaz.java.problemsolving.hackerEarth;

import java.util.Scanner;

/**
 * Created by minhazur on 8/15/16.
 */
public class Sorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        recursivePrint(10);
        return;
    }

    public  static void recursivePrint(int value) {
        if (value == 1) {
            return;
        }
        recursivePrint(value - 1);
        System.out.print(value - 1 + " ");
    }

    public static void  mergeTwoSortedArray() {
        Scanner input = new Scanner(System.in);
        int noOfTestCases = input.nextInt();
        input.nextLine();

        while ( noOfTestCases > 0) {
            String testLine = input.nextLine();

            String[] arraySizes = testLine.split(" ");
            int firstArrayLength = Integer.parseInt(arraySizes[0]);
            int secondArrayLength = Integer.parseInt(arraySizes[1]);

            String firstArrayElements = input.nextLine();
            String[] firstArray = firstArrayElements.split(" ");
            int[] arrayOne = new int[firstArrayLength];
            for(int i = 0; i < firstArrayLength; i++){
                arrayOne[i] = Integer.parseInt(firstArray[i]);
            }

            String secondArrayElements = input.nextLine();
            String[] secondArray = secondArrayElements.split(" ");
            int[] arrayTwo = new int[secondArrayLength];
            for(int i = 0; i < secondArrayLength; i++){
                arrayTwo[i] = Integer.parseInt(secondArray[i]);
            }

            int[] newArray = new int[firstArrayLength+secondArrayLength];
            int fIndex = 0;
            int sIndex = 0;
            for (int i = 0; i < firstArrayLength + secondArrayLength; i++){

                if (fIndex == firstArrayLength) {
                    newArray[i] = arrayTwo[sIndex++];

                } else if (sIndex == secondArrayLength) {
                    newArray[i] = arrayOne[fIndex++];

                } else {
                    if(arrayOne[fIndex] > arrayTwo[sIndex]) {
                        newArray[i] = arrayOne[fIndex++];
                    } else {
                        newArray[i] = arrayTwo[sIndex++];
                    }
                }
            }

            for(int i = 0; i < newArray.length; i++){
                System.out.print(newArray[i] + " ");
            }
            System.out.println();

            noOfTestCases--;
        }

    }



    public static void  noOfBagsLessThenCurrentDay() {
        Scanner input = new Scanner(System.in);
        int noOfTestCases = input.nextInt();
        int noOfBags[];
        while (noOfTestCases > 0) {
            int noOfFriends = input.nextInt();
            noOfBags = new int[noOfFriends];

            for (int i = 0; i < noOfFriends; i++) {
                noOfBags[i] = input.nextInt();
            }

            for (int i = 0; i < noOfBags.length; i++) {
                int keyValue = noOfBags[i];
                int counter = 0;

                for (int j = i + 1; j < noOfBags.length; j++) {
                    if (noOfBags[j] < keyValue) {
                        counter++;
                    }
                }

                System.out.print(counter + " ");
            }

            System.out.println();
            noOfTestCases--;
        }
    }

    public static void sortDescending() {
        Scanner input = new Scanner(System.in);

        int noOfTestCases = input.nextInt();
        int[] numbers;
        int arraySize;
        String inputString;
        while (noOfTestCases > 0) {
            arraySize = input.nextInt();
            numbers = new int[arraySize];

            input.nextLine();
            inputString = input.nextLine();
            String[] inputs = inputString.split(" ");

            for (int i = 0; i < inputs.length; i++) {
                numbers[i] = Integer.parseInt(inputs[i]);
            }

            ///Sorting starts
            for (int i = 1; i < numbers.length; i++) {
                int keyElement = numbers[i];
                int j = i;

                while (j > 0 && keyElement > numbers[j - 1]) {
                    numbers[j] = numbers[j - 1];
                    j--;
                }
                numbers[j] = keyElement;
            }
            ///Sorting ends

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }

            System.out.println();

            noOfTestCases--;
        }

    }


}
