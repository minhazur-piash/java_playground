package com.minhaz.java.oop.cars;

/**
 * Created by Minhaz on 8/24/15.
 */
public class BMW extends Car {
    public BMW() {
    }

    @Override
    public void setBrandName() {
        this.brandName = brandName;
    }

    @Override
    public void doEnhancements() {
        System.out.println("===> Enhancement done for " + this.getClass().getSimpleName());
    }
}
