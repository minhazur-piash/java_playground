package oop.cars;

/**
 * Created by Frenclub on 8/24/15.
 */
public abstract class Car {
    private String test;
    protected String brandName;
    boolean inProgress;

    public Car() {
        System.out.println("Car constructor called");
    }

    public abstract void setBrandName();

    public void printBrandName() {
        System.out.println("Car brandName " + this.brandName);
    }

    public void carType(){}

    @Override
    public String toString() {
        return this.brandName;
    }
}
