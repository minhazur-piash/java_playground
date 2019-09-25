package com.minhaz.java.problemsolving.devskill;

import java.util.Scanner;

/**
 * Created by minhazur on 10/4/16.
 */


public class SixNCryption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            long encryptedNumber = scanner.nextLong();

            int noOfKeys = scanner.nextInt();
            long[] keys = new long[noOfKeys];

            for (int i = 0; i < noOfKeys; i++) {
                keys[i] = scanner.nextLong();
            }

            long multiplier = keys[0];
            for (int i = 1; i < noOfKeys; i++) {
                multiplier = gcdIterative(multiplier, keys[i]);
            }

            // If A is perfectly divided by b then A is also perfectly divided by all the factors of b.
            multiplier = getMaximumPrimeFactor(multiplier);

            int sum = 0;
            for (int i = 0; i < noOfKeys; i++) {
                sum += keys[i] / multiplier;
            }


            System.out.println("Output: " + (encryptedNumber - sum));

            scanner.nextLine();   // This is needed.

        }
    }


    //EuclideanAlgorithm. GCD(A,B) = GCD(B,R) [A = B*Q + R]
    public static long gcdIterative(long a, long b) {
        while (b > 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    /* Ex: Factors of 33 are 3*11. We are taking 11 by dividing 33 by numbers from 2 to 9. For this case divisor is 3.
     If number itself is prime, we are just returning it as it is.
    */
    public static long getMaximumPrimeFactor(long number) {
        for (int i = 2; i <= 9; i++) {
            if ((number % i == 0) && (number / i != 1)) {
                number = number / i;
                break;
            }
        }

        return number;
    }
}
