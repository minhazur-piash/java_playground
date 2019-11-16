package com.minhaz.java.snippet;

import java.util.stream.IntStream;


/**
 * Cell id generator
 */
public class ExcelColumnGenerator {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(0, 400);
        intStream.forEach(v -> {
            String cell = getCellId(v);
            System.out.println("cell = " + cell);
        });
    }

    public static String getCellId(int number) {
        int quotient = number / 26;
        int mod = number % 26;

        StringBuilder cellBuilder = new StringBuilder();
        if (quotient != 0) {
            // (64 + 1) = A, (64 + 2) = B
            char alphabet = (char) (64 + quotient);
            cellBuilder.append(alphabet);
        }

        // (65 + 0) = A, (65 + 1) = B
        char alphabet = (char) (65 + mod);
        cellBuilder.append(alphabet);
        return cellBuilder.toString();
    }
}
