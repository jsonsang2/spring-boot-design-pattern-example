package com.example.springbootdesignpatternexample.factorymethod;

public class GenesisCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new GenesisCar();
    }
}
