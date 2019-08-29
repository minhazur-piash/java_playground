package java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSort {

    public static void main(String[] args) {

        Map<String, Long> resultsOfSectionA = new HashMap<>();
        resultsOfSectionA.put("S1", (long) 60);
        resultsOfSectionA.put("S2", (long) 90);
        resultsOfSectionA.put("S3", (long) 99);
        resultsOfSectionA.put("S4", (long) 95);
        resultsOfSectionA.put("S5", (long) 33);

        Map<String, Long> resultsOfSectionB = new HashMap<>();
        resultsOfSectionB.put("S1", (long) 55);
        resultsOfSectionB.put("S2", (long) 89);
        resultsOfSectionB.put("S3", (long) 99);
        resultsOfSectionB.put("S4", (long) 93);
        resultsOfSectionB.put("S5", (long) 35);


        Map<String, Map<String, Long>> sections = new HashMap<>();
        sections.put("A", resultsOfSectionA);
        sections.put("A", resultsOfSectionB);

        List<Map.Entry<String, Map<String, Long>>> result2 = sections.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Map<String, Long>>comparingByKey()
                        .thenComparingLong(e -> e.getValue()
                                .values()
                                .stream()
                                .mapToLong(i -> i)
                                .sum()))
                .collect(Collectors.toList());

    }
}
