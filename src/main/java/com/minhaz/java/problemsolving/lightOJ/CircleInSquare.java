package com.minhaz.java.problemsolving.lightOJ;

import java.util.Scanner;

/**
 * Created by minhazur on 9/10/16.
 */
public class CircleInSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        for (int i = 1; i <= tc; i++) {
            double radius = scanner.nextDouble();

            double pi = Math.acos(0.0) * 2;

            double areaOfCircle = pi * Math.pow(radius, 2);
            double areaOfSquare = Math.pow((2 * radius), 2);
            double shadedArea = (areaOfSquare - areaOfCircle) + Math.pow(10, -9);

            System.out.println("Case " + i + ": " + String.format("%.2f", shadedArea));
        }

    }
}
