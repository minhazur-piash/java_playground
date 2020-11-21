package com.minhaz.java.problemsolving.wallethub;

import java.util.ArrayList;
import java.util.List;


// coderbyte problems
// https://coderbyte.com/
public class WalletHub {

    public static void main(String[] args) {
        String sentence = "fun&!! time";
        System.out.println("WalletHub.longestWord(sentence) = " + WalletHub.longestWord(sentence));

        System.out.println("is palindrome: " + isPalindrome("never odd or even"));
        String s = stringScramble("Hello", "worldhell");
        System.out.println("s = " + s);

    }

    // String Scramble, if any part can be matched to other
    public static String stringScramble(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        String minStr = (str1.length() < str2.length()) ? str1 : str2;
        String maxStr = (str1.length() > str2.length()) ? str1 : str2;

        char[] minStrChars = minStr.toCharArray();
        List<Character> maxStrChars = new ArrayList<>();

        for (char ch : maxStr.toCharArray()) {
            maxStrChars.add(ch);
        }

        for (Character chr : minStrChars) {
            if (maxStrChars.contains(chr)) {
                maxStrChars.remove(chr);
            } else {
                return "false";
            }

        }
        return "true";
    }

    // find palindrome ignoring space in between words
    public static boolean isPalindrome(String word) {
        word = word.replace(" ", "");
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversedWord);
    }

    // find the longest word ignoring punctuation
    public static String longestWord(String sen) {
        String[] words = sen.split(" ");
        int maxWordLength = 0;
        String maxWord = "";

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z ]", "");
            System.out.println("word = " + word);
            int wordLength = word.length();
            if (wordLength > maxWordLength) {
                maxWordLength = wordLength;
                maxWord = word;
            }
        }

        return maxWord;
    }

    // CoinDeterminer: coins(1, 5, 7, 9, 11), how many coins needed to form 16 using minimum coins. for 16 => 7,9
}
