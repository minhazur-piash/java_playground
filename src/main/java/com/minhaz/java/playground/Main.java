package com.minhaz.java.playground;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner("abcde\nx");
        System.out.println(scanner.findInLine("."));     // output: a
        scanner.nextLine();
        System.out.println(scanner.findInLine("."));     // output: x

        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        System.out.println(sb.toString());
    }
}