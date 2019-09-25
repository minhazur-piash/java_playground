package com.minhaz.java.coursera.princeton.algorithm;

public class ShellSort {
    private int[] numbers;

    public ShellSort(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] apply() {
        int h = getNumberOfInterleavedSorting();
        System.out.println("Number of interleaved sort needed: " + h);

        // we will apply h number of interleaved insertion sort. Last one is 1 insertion sort.
        while (h >= 1) {
            for (int i = h; i < numbers.length; i++) {
                int currentValue = numbers[i];
                int j = i;
                while (j >= h && currentValue < numbers[j - h]) {
                    numbers[j] = numbers[j - h];
                    j = j - h;
                }
                numbers[j] = currentValue;
            }
            h = h / 3;
        }

        return numbers;
    }

    private int getNumberOfInterleavedSorting() {
        int h = 1;
        while (h < numbers.length / 3) {
            h = 3 * h + 1;
        }
        return h;
    }

}
