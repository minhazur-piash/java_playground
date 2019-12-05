package com.minhaz.java.oop.cars;

/**
 * Created by Minhaz on 8/24/15.
 */
public abstract class Car {
    private String test;
    protected String brandName;
    boolean inProgress;

    // default constructor is must for a base class if there is a parameterized constructor in it
    // and subclasses doesn't explicitly call super(args,...) from the constructors
    // If constructor is private, class can not be inherited
    public Car() {
        System.out.println("Car's default constructor called");
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
