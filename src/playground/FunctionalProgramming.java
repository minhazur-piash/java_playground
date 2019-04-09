package playground;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FunctionalProgramming {

    public static void main (String[] args) {
        int[] sites = {1, 0, 1, 1, 0, 0, 0};
        long count = Arrays.stream(sites).filter( value -> value == 1).count();
        System.out.println(count);
    }
}
