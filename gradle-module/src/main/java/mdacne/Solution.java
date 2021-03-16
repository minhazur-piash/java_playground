package mdacne;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String[] strs = line.split("\\s+");

        int size = Integer.parseInt(strs[0]);

        int[] arr = new int[size];

        line = br.readLine();
        String[] strs2 = line.split("\\s+");

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(strs2[i]);

        }
        if (size == 1) {
            for (int itr : arr) {
                System.out.print(itr + " ");
            }

        } else {
            int x = Integer.parseInt(strs[1]);
            int diff = Math.abs(size - x);

            for (int j = 0; j < diff; j++) {
                int store = arr[size - 1];
                for (int i = size - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = store;
            }

            for (int itr : arr) {
                System.out.print(itr + " ");

            }
        }
    }
}