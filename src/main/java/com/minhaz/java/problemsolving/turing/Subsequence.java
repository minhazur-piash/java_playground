package com.minhaz.java.problemsolving.turing;

import java.util.Arrays;
import java.util.Scanner;

class SolutionOfSubsequence {
    public static int minimumConcat(String initial, String goal) {

        String[] arrOfStr = initial.split("[a-z]", 0);
        Arrays.stream(arrOfStr).forEach(System.out::println);

        return 0;
    }
}


public class Subsequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String initial = sc.next();
        String goal = sc.next();
        int res = SolutionOfSubsequence.minimumConcat(initial, goal);
        System.out.println(res);
    }
}
