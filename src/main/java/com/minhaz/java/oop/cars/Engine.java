package com.minhaz.java.oop.cars;

/**
 * Created by minhazur on 10/7/16.
 */
public interface Engine {
    //can have static member variables and methods. By default all members are public.

    int horsePower = 700;  // member variables are by default public and final(Constant)

    //abstract methods. Can't have method definition
    void start();
    void stop();

    //default & static methods can have method definition
    static void selfDrive() {
        System.out.println("self driving...");
    }
}
