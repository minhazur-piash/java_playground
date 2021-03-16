package com.minhaz.java.java8;

import java.util.stream.IntStream;

public class ParallelProcessing {
    public static void main(String[] args) {

        System.out.println("Normal...");

        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(System.out::println);

        System.out.println("Parallel...");

        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel()
                .forEach(it ->
                        System.out.println(Thread.currentThread().getName() + " " + it)
                );

    }
}
