package com.minhaz.java.certification;

public class TestString {
    public static void main(String[] args) {

        int[][] matrix = new int[100][100];
        int length = matrix.length;

        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        String substring = s1.substring(4);
        System.out.println("substring = " + substring);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
    }

}