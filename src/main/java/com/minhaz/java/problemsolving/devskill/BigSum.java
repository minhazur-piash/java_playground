package com.minhaz.java.problemsolving.devskill;



import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by minhazur on 10/1/16.
 */
public class BigSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger number1, number2;

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] str = input.split(",");

            number1 = new BigInteger(new StringBuilder(str[0]).reverse().toString());
            number2 = new BigInteger(new StringBuilder(str[1]).reverse().toString());

            number1 = number1.add(number2);

            int maxLength = str[0].length() > str[1].length() ? str[0].length() : str[1].length();

            String leadingZeros = "";
            for (int i = 1; i <= maxLength - new String(number1+"").length(); i++ ){
                leadingZeros += "0";
            }

            System.out.println(new StringBuilder(leadingZeros + number1).reverse().toString().replaceFirst("^0*", ""));
        }

    }
}
