package com.minhaz.java.problemsolving.turing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static int numOffices(String[][] grid) {
        int result = 0;

        int numberOfRows = grid.length;
        int numberOfColumns = grid[0].length;

        List<String> strings = gridToList(grid);
        strings.stream().forEach(System.out::print);
        System.out.println();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equals("1")) {
                if (shouldAdd(i, numberOfColumns, strings)) {
                    System.out.println("adding for index " + i);
                    result++;
                }
            }
        }

        System.out.println();

        return result;
    }

    private static boolean shouldAdd(int index, int numberOfColumns, List<String> strings) {
        if (index == 0) {
            return true;
        }

        if (strings.get(index - 1).equals("1")) {
            return false;
        }

        int verticallyAdjacentIndex = index - numberOfColumns;
        if (verticallyAdjacentIndex < 0) {
            return true;
        }

        if (strings.get(verticallyAdjacentIndex).equals("1")) {
            return false;
        }

        return true;
    }

    public static <T> List<T> gridToList(T[][] grid) {
        List<T> list = new ArrayList<T>();
        for (T[] array : grid) {
            list.addAll(Arrays.asList(array));
        }
        return list;
    }
}


class Rextester {
    public static String[][] getMatrix() {
        Scanner sc = new Scanner(System.in);
        int rowsLen = sc.nextInt();
        int colsLen = sc.nextInt();
        String matrix[][] = new String[rowsLen][colsLen];
        int i;
        for (i = 0; i < rowsLen; i++) {
            String line = sc.next();
            for (int j = 0; j < line.length(); j++) {
                matrix[i][j] = String.valueOf(line.charAt(j));
            }
        }
        return matrix;
    }

    public static void main(String args[]) {
        int result = Solution.numOffices(getMatrix());
        System.out.println(result);
    }
}