package com.minhaz.java.snippet;

import java.io.IOException;
import java.util.Comparator;

public class CloseEnoughComparator implements Comparator<String> {
    public int compare(String obj1, String obj2) {
        if (obj1 == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        if (obj1.equals(obj2)) {
            return 0;
        }
        String s1 = obj1.trim();
        String s2 = obj2.trim();
        return s1.compareToIgnoreCase(s2);
    }
}

class CloseEnoughComparatorTest {
    public static void main(String[] args) throws IOException {
        String s1 = "bleu fonce";
        String s2 = "Bleu foncé   ";
        Comparator<String> comparator = new CloseEnoughComparator();
        if (comparator.compare(s1, s2) == 0) {
            System.out.println("s1 and s2 have equal values");
        } else {
            System.out.println("s1 and s2 do NOT have equal values");
        }
    }
};
