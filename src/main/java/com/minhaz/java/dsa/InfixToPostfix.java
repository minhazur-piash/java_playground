package com.minhaz.java.dsa;


import java.util.*;

/**
 * Created by minhaz on 4/9/17.
 */
public class InfixToPostfix {

    static String output = "";
    static Stack operatorStack = new Stack();

    public static void main(String[] args) {
        Hashtable precedences = new Hashtable();
        precedences.put('-', 2);
        precedences.put('+', 2);

        precedences.put('*', 3);
        precedences.put('/', 3);
        precedences.put('%', 3);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            output = "";

            char[] charArray = input.toCharArray();

            for (char character : charArray) {
                if (Character.isLetter(character)) {
                    output += character;
                    continue;
                }

                if (isOperator(character)) {
                    if (!operatorStack.isEmpty()) {
                        manageOperatorStack(precedences, character);
                    }
                    operatorStack.push(character);
                    continue;
                }

                if (character == '(') {
                    operatorStack.push(character);
                    continue;
                }

                if (character == ')') {
                    popTillStartingParenthesis();
                    continue;
                }
            }

            while (!operatorStack.isEmpty()) {
                output += operatorStack.pop();
            }

            System.out.println("postfix equivalent to input: " + output);
        }
    }

    private static void manageOperatorStack(Dictionary<Character, Integer> precedences, char character) {
        ListIterator<Character> iterator = operatorStack.listIterator(operatorStack.size());
        while (iterator.hasPrevious()) {
            char prevChar = iterator.previous();
            if (prevChar == '(') {
                return;
            }

            int prePrecedence = precedences.get(prevChar);
            int currentPrecedence = precedences.get(character);

            if (prePrecedence >= currentPrecedence) {
                output += prevChar;
                iterator.remove();
            }
        }
    }

    private static void popTillStartingParenthesis() {
        ListIterator<Character> iterator = operatorStack.listIterator(operatorStack.size());
        while (iterator.hasPrevious()) {
            char prevChar = iterator.previous();
            if (prevChar == '(') {
                iterator.remove();
                return;
            }
            output += prevChar;
            iterator.remove();
        }

    }

    private static boolean isOperator(char character) {
        if (character == '+')
            return true;
        if (character == '-')
            return true;
        if (character == '*')
            return true;
        if (character == '/')
            return true;
        if (character == '%')
            return true;

        return false;
    }
}

