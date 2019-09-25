package com.minhaz.java.problemsolving.devskill;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by someone from devSkill on 10/4/16.
 */
public class SixNCryption2 {


    private static Scanner kbScanner;
    private static Set<Long> ekSet;

    public static void main(String[] args) throws java.lang.Exception {

        kbScanner = new Scanner(System.in);

        int testCase = kbScanner.nextInt();
        if (testCase > 0) {
            long[] answer = new long[testCase];
            for (int i = 0; i < testCase; i++) {
                long eNval = kbScanner.nextLong();
                int nEk = kbScanner.nextInt();
                long finalAns = getFinalAns(nEk, eNval);
                if (finalAns != -1) {
                    answer[i] = finalAns;
                } else
                    return;
                System.out.println("");
            }

            for (int i = 0; i < answer.length; i++) {
                System.out.println("Output: " + answer[i]);
            }

        }

    }

    private static long getFinalAns(int eK, long eNval) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        ekSet = new TreeSet<>();
        for (int i = 0; i < eK; i++) {
            long number = kbScanner.nextLong();
            if (number > 0) {
                ekSet.add(number);
            } else
                return -1;
        }
        Iterator<Long> iter = ekSet.iterator();
        long primeselector = iter.next();

        long bigPrime = getPrime(primeselector);

        long sum = primeselector / bigPrime;

        for (int i = 1; i < ekSet.size(); i++) {

            sum += iter.next() / bigPrime;

        }

        return eNval - sum;
    }

    private static long getPrime(long primeselector) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        boolean check;
        long prime = 0;

        if (primeselector <= 2) {
            prime = primeselector;
            return prime;
        } else {
            for (int i = 2; i <= primeselector; ) {
                if (primeselector % i == 0) {
                    long testprime = primeselector / i;
                    check = primeCheck(testprime);
                    if (check) {
                        prime = testprime;
                        break;
                    } else
                        i++;
                } else
                    i++;
            }
            return prime;
        }
    }

    private static boolean primeCheck(long prime) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        if (prime <= 2) {
            return true;
        } else {
            for (long i = 2; i < prime; i++) {
                if (prime % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


}
