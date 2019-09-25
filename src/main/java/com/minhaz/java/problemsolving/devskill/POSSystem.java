package com.minhaz.java.problemsolving.devskill;

import java.util.Scanner;

/**
 * Created by minhazur on 10/7/16.
 */
public class POSSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int tc = 1; tc <= cases; tc++) {

            int items = scanner.nextInt();
            double totalPrice = 0;
            for (int i = 1; i <= items; i++) {
                double price = scanner.nextDouble();
                int quantity = scanner.nextInt();

                totalPrice += price * quantity;
            }

            double amountPaid = scanner.nextDouble();

            System.out.println("Case " + tc + ": " + ((int)(Math.floor(amountPaid - totalPrice))));
        }

    }
}
