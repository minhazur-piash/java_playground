package com.minhaz.java.oop.cars;

/**
 * Created by Frenclub on 8/24/15.
 */
public abstract class Car {
    private String test;
    protected String brandName;
    boolean inProgress;

    //default constructor is must for a base class if there is a parameterized constructor in it.
    // If constructor is private, class can not be inherited
    public Car() {
        System.out.println("Car deafault constructor called");
    }

    public Car(boolean inProgress) {
        this.inProgress = inProgress;
        System.out.println("Car parameterized constructor called");
    }

    public abstract void setBrandName();
    public abstract void doEnhancements();

    public void printBrandName() {
        System.out.println("Car brandName " + this.brandName);
    }

    public void carType(){}

    @Override
    public String toString() {
        return this.brandName;
    }
}
