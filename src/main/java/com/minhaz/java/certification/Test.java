package com.minhaz.java.certification;

public class Test {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;

        // int[] arr = new int[-2];  // java.lang.NegativeArraySizeException

        Double number = Double.valueOf("120D");
        System.out.println("number = " + number);

        // Integer intNumber = Integer.valueOf("100.1");  // java.lang.NumberFormatException: For input string: "100.1"

        int[] testData = {1, 2, 3};
        for (int i : testData) {
            System.out.println("i = " + i);
        }

        String s = "a";
        switch (s) {
            case "a":
                System.out.println("s = " + s);
            default:
                System.out.println("s = " + s);
            case "A":
                System.out.println("s = " + s);
        }

        try {
            for (int z = 2; z >= 0; z--) {
                int ans = x / z;
                System.out.print(ans + " ");
            }
        } catch (Exception e1) {
            System.out.println("E1");

        } /*catch (ArithmeticException e1) {  // FIXME: Already caught by Exception, so compilation error
            System.out.println("E2");
        }*/
    }
}