package com.minhaz.java.playground.refactoring;

import com.minhaz.java.playground.PageData;

import java.util.Scanner;

/**
 * Created by minhazur on 5/17/16.
 */
public class DummyRefactored {

    public static void main(String[] args) {
        generateAverageOfInput();
    }

    private static void generateAverageOfInput() {
        Scanner input = new Scanner(System.in);
        int countNegatives = 0;
        int countPositives = 0;
        int sum = 0;

        String aBetterDayInThisWeek;

        System.out.println("Enter an integer, the input ends if it is 0: ");
        int userInput = input.nextInt();

        while (userInput != 0) {
            sum += userInput;

            if (userInput < 0) {
                countNegatives++;

            } else {
                countPositives++;
            }

            System.out.println("Enter an integer, the input ends if it is 0: ");
            userInput = input.nextInt();
        }

        System.out.println("The total is: " + sum);
        float average = sum / (countPositives + countNegatives);
        System.out.println("The average is " + average);
    }


    public static String renderPageWithSetupsAndTeardowns( PageData pageData,
                                                           boolean isSuite) {
        if (isTestPage(pageData)) {
            includeSetupAndTeardownPages(pageData, isSuite);
        }
        return pageData.getHtml();
    }

    private static void includeSetupAndTeardownPages(PageData pageData, boolean isSuite) {

    }

    private static boolean isTestPage(PageData pageData) {
        return false;
    }


}
