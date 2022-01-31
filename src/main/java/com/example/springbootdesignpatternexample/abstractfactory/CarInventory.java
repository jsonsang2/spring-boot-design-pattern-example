package com.example.springbootdesignpatternexample.abstractfactory;

import com.example.springbootdesignpatternexample.factorymethod.Car;
import com.example.springbootdesignpatternexample.factorymethod.CarFactory;

public class CarInventory {

    public static void main(String[] args) {

        CarFactory carFactory = new GenesisFactory(new WhitePartsFactory());
        Car car = carFactory.createCar();
        System.out.println(car.getHandle().getClass());
        System.out.println(car.getWheel().getClass());
    }
}
