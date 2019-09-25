package com.minhaz.java.problemsolving.codingbat;


/**
 * Created by minhazur on 10/31/16.
 * http://codingbat.com/prob/p192383
 */

public class Count8 {
    public static void main(String[] args) {
        System.out.println(new Count8().count8(878));
    }

    /**
     *
     * @param n non-negative integer n.
     * @return number of 8 found in n + 1 for left digit if it is 8 also. Ex: 717 ==> 2
     */
    public int count8(int n) {
        if (n == 0) {
            return 0;
        }

        return count(n % 10, (n / 10) % 10) + count8(n / 10);
    }

    public int count(int right, int left) {
        int sum = 0;
        if (right == 8) {
            sum++;
        }

        if (right == 8 && left == 8) {
            sum++;
        }

        return sum;
    }

}
