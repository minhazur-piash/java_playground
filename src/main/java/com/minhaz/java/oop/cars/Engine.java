package com.minhaz.java.oop.cars;

/**
 * Created by minhazur on 10/7/16.
 */

/* An interface implicitly declares one method for each public method in Object.
  Thus the toString, equals methods are implicitly declared as members in an interface (unless it already inherits
  it from a superinterface). */
public interface Engine {
    //can have static member variables and methods. By default all members are public.

    int horsePower = 700;  // member variables are by default public and final(Constant)

    //abstract methods. Can't have method definition
    void start();

    void stop();

    String toString();

    //default & static methods can have method definition
    static void selfDrive() {
        System.out.println("self driving...");
    }
}
