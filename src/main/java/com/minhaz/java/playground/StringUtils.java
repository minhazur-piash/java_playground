package com.minhaz.java.playground;

/**
 * Created by minhazur on 10/2/16.
 */
public class StringUtils {
    public static void main(String[] args) {
        int a = 1;
        String b = "2";
        int sum =  1;
        System.out.println(a + b);


        String string = "aaccab";
        int count = string.length() - string.replaceAll("a", "").length();

        System.out.println(count);
    }
}
