package com.minhaz.java.problemsolving.devskill;

import java.util.Scanner;

/**
 * Created by minhazur on 10/7/16.
 */
public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int tc = 1; tc <= cases; tc++) {

            int rows = scanner.nextInt();
            int columns = scanner.nextInt();
            scanner.nextLine();

            String[][] map = new String[rows][columns];
            for (int i = 0; i < rows; i++) {

                String input = scanner.nextLine();
                for (int c = 0; c < columns; c++) {
                    map[i][c] = Character.toString(input.charAt(c));
                }

            }

            System.out.println("Case " + tc + ":");
            boolean found = false;
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < columns; c++) {
                    if (map[r][c].equals("$")) {
                        found = true;
                        System.out.println((r + 1) + "," + (c + 1));
                    }
                }
            }

            if (!found) {
                System.out.println("No Gold Found");
            }

        }

    }
}
