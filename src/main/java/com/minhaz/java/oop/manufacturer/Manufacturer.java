package com.minhaz.java.oop.manufacturer;

import com.minhaz.java.oop.cars.Car;
import com.minhaz.java.oop.cars.Premio;

/**
 * Created by Frenclub on 8/24/15.
 */

public class Manufacturer{
    public static void main(String[] args){
        Car car = new Premio("XX2");
        car.doEnhancements();
        car.printBrandName();
    }
}
