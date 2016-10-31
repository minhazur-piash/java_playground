package oop.manufacturer;

import oop.cars.Car;
import oop.cars.Premio;

/**
 * Created by Frenclub on 8/24/15.
 */

public class Manufacturer{
    public static void main(String[] args){
        Car car = new Premio("XX2");
        car.printBrandName();
    }
}
