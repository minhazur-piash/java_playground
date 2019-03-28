package coursera.princeton.algorithm;

import java.util.Arrays;

public class Ignitor {

    static QuickUnion quickUnion;

    public static void main(String[] args) {
        quickUnion = new QuickUnion(10);
        System.out.println(Arrays.toString(quickUnion.getNodes()));
        quickUnion.union(4, 3);
        System.out.println(Arrays.toString(quickUnion.getNodes()));
        /*quickUnion.union(3, 8);
        System.out.println(Arrays.toString(quickUnion.getNodes()));
        quickUnion.union(6, 5);
        System.out.println(Arrays.toString(quickUnion.getNodes()));
        quickUnion.union(9, 4);
        System.out.println(Arrays.toString(quickUnion.getNodes()));
        quickUnion.union(2, 1);*/
//        quickUnion.union(5, 0);
//        quickUnion.union(7, 2);
//        quickUnion.union(6, 1);
//        quickUnion.union(7, 3);
        System.out.println(Arrays.toString(quickUnion.getNodes()));

        isConnected(8, 7);
        isConnected(4, 3);
        isConnected(0, 7);
    }

    private static void isConnected(int p, int q) {
        System.out.println(p + ", " + q + " is connected: " + quickUnion.isConnected(p, q));
    }
}
