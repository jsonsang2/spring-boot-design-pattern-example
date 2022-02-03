package com.example.springbootdesignpatternexample.factorymethod;

public class KiaCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new KiaCar();
    }
}
