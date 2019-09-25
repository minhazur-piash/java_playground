package com.minhaz.java.problemsolving.hackerEarth;

import java.util.Scanner;

/**
 * Created by minhazur on 2/29/16.
 */
public class StringProblems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        for (int i = 1; i <= testCases; i++){
            int friendsInvited = input.nextInt();
            int giftCost = input.nextInt();

            int[] giftPrices = new int[friendsInvited];
            for(int index = 0; index < friendsInvited; index ++){
                giftPrices[index] = input.nextInt();
            }

            for (int j = 0; j < giftPrices.length; j++){
                int totalPrice = 0;
                boolean isPossible = false;

                for (int k = j; k < giftPrices.length; k++){
                    totalPrice += giftPrices[k];

                    if(totalPrice > giftCost){
                        break;
                    }

                    if(totalPrice == giftCost){
                        isPossible = true;
                        break;
                    }
                }

                if(isPossible){
                    System.out.println("YES");
                    break;
                }

            }

        }

    }

    private static void removeConsecutives(Scanner input, int testCases) {
        for (int i = 1; i <= testCases; i++) {
            String word = input.next();

            String prevChar = "";
            String output = "";

            for (int j = 0; j < word.length(); j++) {
                String charAt = word.charAt(j) + "";
                if (prevChar.equals(charAt)) {
                    continue;
                }

                output += charAt;
                prevChar = charAt;
            }
            System.out.println(output);
        }
    }

    private static void reverseString() {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        for (int i = 1; i <= testCases; i++) {
            String word = input.next();

            int index = 0;
            String reverseWord = "";
            while (index < word.length()) {
                reverseWord = word.charAt(index) + reverseWord;  //TODO: NOTE ***
                index++;
            }
            System.out.println(reverseWord);
        }
    }


}
