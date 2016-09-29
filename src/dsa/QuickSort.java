package dsa;

import java.util.Arrays;

/**
 * Created by minhazur on 9/28/16.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5, 6};
        new QuickSort().recQuickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public void recQuickSort(int[] arr, int left, int right) {
        if (right - left <= 0) {
            return;

        } else {
            int pivot = arr[right];
            int partition = partitionIt(arr, left, right, pivot);
            recQuickSort(arr, left, partition - 1);
            recQuickSort(arr, partition + 1, right);
        }
    }

    public int  partitionIt(int[] arr, int left, int right, int pivot)  {
        int leftMark = left - 1;
        int rightMark = right;

        while (true) {
            while (arr[++leftMark] < pivot) ;
            while (rightMark > 0 && arr[--rightMark] > pivot);

            if (leftMark >= rightMark) {
                break;
            } else {
                int tmp = arr[leftMark];
                arr[leftMark] = arr[rightMark];
                arr[rightMark] = tmp;
            }
        }
        int tmp = arr[leftMark];
        arr[leftMark] = arr[right];
        arr[right] = tmp;

        return leftMark;

    }
}
