package com.minhaz.java.snippet;

import com.minhaz.java.java8.Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

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
            char alphabet = (char) (64 + quotient);  // (64 + 1) = A, (64 + 2) = B
            cellBuilder.append(alphabet);
        }

        char alphabet = (char) (65 + mod);
        cellBuilder.append(alphabet);
        return cellBuilder.toString();
    }
}
