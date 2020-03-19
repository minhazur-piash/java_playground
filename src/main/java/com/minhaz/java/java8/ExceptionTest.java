package com.minhaz.java.java8;

public class ExceptionTest {
    static {
        System.out.println("===> static initializer");
    }

    {
        System.out.println("===> instance initializer 1");
    }

    {
        System.out.println("===> instance initializer 2");
    }

    public static void main(String[] args) {
        String name_ = "test";

        new ExceptionTest();

        {
            System.out.println("===> empty code block");
        }
    }
}
