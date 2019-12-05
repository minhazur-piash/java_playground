package com.minhaz.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Experiment {
    public static void main(String[] args) {

        String[] names = {"Peter", "Paul", "Mary"};
        List<Runnable> runners = new ArrayList<>();
        for (String name : names) {
            runners.add(() -> System.out.println(name));
        }

        runners.forEach(Runnable::run);

        List<String> wordList = Arrays.asList("Hello", "World", "BIG");
        Stream<String> words = wordList.stream();
        Stream<String> longWords = words.filter(w -> w.length() > 3);
        System.out.println("longWords.count() = " + longWords.count());

        Stream<String> lowercaseWords = wordList.stream().map(String::toLowerCase);
        lowercaseWords.forEach(System.out::println);
    }

    public static boolean isOrthogonal() {
        System.out.println("isOrthogonal called");
        return false;
    }
}

interface FunctionalInterface {
    String toString();
}
