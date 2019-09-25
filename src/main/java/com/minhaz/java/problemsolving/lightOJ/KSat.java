package com.minhaz.java.problemsolving.lightOJ;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by minhazur on 9/10/16.
 */
public class KSat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        for (int i = 1; i <= tc; i++) {
            int wishers = scanner.nextInt();
            int objects = scanner.nextInt();
            int wishesCount = scanner.nextInt();
//            System.out.println(i + " negative " + wishers + " " + objects + " " + wishesCount);

            int[][] wishes = new int[wishers][wishesCount];
            Integer[] solutions = new Integer[objects + 1];

            for (int r = 0; r < wishers; r++) {
                for (int c = 0; c < wishesCount; c++) {
                    wishes[r][c] = scanner.nextInt();
                }
            }


            scanner.nextLine();
            String solutionString = scanner.nextLine();
            String[] sols = solutionString.split(" ");
            for (int c = 0; c < sols.length; c++){
                solutions[c] = Integer.parseInt(sols[c]);
            }
//            scanner.nextLine();

            boolean result = false;
            for (int r = 0; r < wishers; r++) {  // for each wisher
                result = false;
                for (int c = 0; c < wishesCount; c++) { // for each object
                    int object = wishes[r][c];
                    if ( object < 0) {
                        if (!Arrays.asList(solutions).contains(Math.abs(object))) {
                            result = true;
                            break;
                        }
                    }

                    if (Arrays.asList(solutions).contains(object)) {
                        result = true;
                        break;
                    }
                }

                if (result == false) {
                    break;
                }
            }

            System.out.println("Case " + i + ": " + (result == true ? "Yes" : "No"));
        }

    }
}
