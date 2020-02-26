package com.minhaz.java.java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class Experiment2 {

    public static void main(String[] args) {
        Stream<String> names = Stream.of("Dhaka", "Mymensingh", "Bogra");

        // Using functional interface Consumer
        names.forEach((name) -> {
            System.out.println("===> name = " + name);
        });

        System.out.println();

        names = Stream.of("Dhaka", "Mymensingh", "Bogra");
        // Using method reference
        names.forEach(Experiment2::print);
    }

    public static void print(String string) {
        System.out.println("===> string = " + string);
    }
}
