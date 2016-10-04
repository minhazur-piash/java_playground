package dsa;

/**
 * Created by minhazur on 10/4/16.
 */


public class GCD {
    public static void main(String[] args) {
        System.out.println(new GCD().gcdRecursive(16, 15));
        System.out.println(new GCD().gcdIterative(16, 15));

    }

    //EuclideanAlgorithm. GCD(A,B) = GCD(B,R) [A = B*Q + R]
    public int gcdRecursive(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            int r = a % b;
            return gcdRecursive(b, r);
        }
    }

    //EuclideanAlgorithm. GCD(A,B) = GCD(B,R) [A = B*Q + R]
    public int gcdIterative(int a, int b) {
        while (b > 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
}
