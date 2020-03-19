package com.minhaz.java.basic;

public class SwitchStatement {
    public static Integer inputValue;
    public static void main(String[] args) {
        inputValue = 100;

        switch (inputValue) {
            default:
                System.out.println("===> default");
                break;
            case 1:
                System.out.println("===> input value 1" + inputValue);
                break;
            case 2:
                System.out.println("===> input value 2" + inputValue);

        }
    }
}
