package com.minhaz.java.basic;

import java.util.ArrayList;
import java.util.List;

public class BasicJava {
    private long value = 1000;

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

        new BasicJava();
        {
            System.out.println("===> empty code block");
        }

        List<String> names = new ArrayList<>();
        String str = null;




    }
}
