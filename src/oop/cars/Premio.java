package oop.cars;

/**
 * Created by Frenclub on 8/30/15.
 */
public class Premio extends Toyota {
    private String model;

    public Premio() {
        System.out.println("Premio default constructor called");
    }

    public Premio(String model) {
//        super(true);
        System.out.println("Premio parameterized constructor called");
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printModel() {
        System.out.println("Model name " + model);
    }

    public void printBrandName() {
        System.out.println("[" + Premio.class.getName() + "]" + " Car brandName " + this.brandName);
    }
}
