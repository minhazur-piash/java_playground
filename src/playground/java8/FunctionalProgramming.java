package playground.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalProgramming {

    public static void main(String[] args) {
        List<Object> objects = Arrays.asList(2, 3.14, "four");
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", String::length);
        System.out.println(value);

        checkIsEven(10, number -> number % 2 == 0);
        checkIsEven(12, FunctionalProgramming::isEven);

    }
    
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void checkIsEven(int number, EvenChecker checker) {
        System.out.println(checker.check(number));
    }

    @FunctionalInterface
    public interface EvenChecker {
        boolean check(int number);
    }
}



