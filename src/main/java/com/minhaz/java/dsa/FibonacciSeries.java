package com.minhaz.java.dsa;

/**
 * Created by minhazur on 10/1/16.
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        int fibNumber = new FibonacciSeries().showFibonacciForPosition(8);
        System.out.println(fibNumber);
    }

    /**
     * By definition, the first two numbers in the Fibonacci sequence are either 1 and 1, or 0 and 1,
     * depending on the chosen starting point of the sequence, and each subsequent number is the sum of the previous two.
     *
     * we should use dynamic programming to optimize this or get ready to sleep with this :P :P :P
     * @param position
     * @return
     */
    public int showFibonacciForPosition(int position) {
        if (position == 1) {
            return 1;
        } else if (position == 2) {
            return 1;
        } else {
            return showFibonacciForPosition(position - 1) + showFibonacciForPosition(position - 2);
        }
    }
}
