package com.minhaz.java.problemsolving.codingbat;

/**
 * Created by minhazur on 11/2/16.
 * http://codingbat.com/prob/p170371
 */
public class CountX {

    public static void main(String[] args) {
        System.out.println(new CountX().changeXY("xhix"));
    }

    public static int countX(String str) {
        if (str.equals("")) {
            return 0;
        }

        return count(str.charAt(0)) + countX(str.substring(1));
    }

    public static int count(Character c) {
        if (c.equals(new Character('x'))) {
            return 1;
        }

        return 0;
    }

    public String changeXY(String str) {
        if (str.equals("")) {
            return "";
        }

        String single = str.substring(0, 1);
        if (single.equals("x")) {
            single = "y";
        }

        return single + changeXY(str.substring(1));
    }


    public int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }

        return count(str.substring(0, 2)) + countHi(str.substring(1));
    }

    public  int count(String s) {
        if (s.equals("hi")) {
            return 1;
        }

        return 0;
    }
}
