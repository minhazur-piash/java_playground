package com.minhaz.java.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        Stream<String> fruits = Stream.of("Apple", "Banana", "Mango");

        Stream<String> words = Stream.of("Apple", "Mangoooo", "Apple");
        Stream<Integer> integerStream = words.map(String::length);
        integerStream.forEach(System.out::println);

        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        Map<String, String> languageNames = locales.collect(
                Collectors.toMap(l -> l.getDisplayLanguage(), l -> l.getDisplayLanguage(l), (existingValue, newValue) -> existingValue)
        );
        languageNames.forEach((k, v) -> System.out.println(" key: " + k + " value: " + v));

        locales = Stream.of(Locale.getAvailableLocales());
        Map<String, Set<String>> countryLanguageSets = locales.collect(
                Collectors.toMap(l -> l.getDisplayCountry(), l -> Collections.singleton(l.getDisplayLanguage()),
                        (a, b) -> {
                            Set<String> r = new HashSet<>(a);
                            r.addAll(b);
                            return r;
                        }
                )
        );
        countryLanguageSets.forEach((k, v) -> {
            System.out.println("key: " + k + " values: " + Arrays.toString(v.toArray()));
        });
    }
}
