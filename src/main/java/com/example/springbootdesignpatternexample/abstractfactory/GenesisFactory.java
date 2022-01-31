package com.example.springbootdesignpatternexample.abstractfactory;

import com.example.springbootdesignpatternexample.factorymethod.Car;
import com.example.springbootdesignpatternexample.factorymethod.CarFactory;
import com.example.springbootdesignpatternexample.factorymethod.GenesisCar;

public class GenesisFactory implements CarFactory {

    private CarPartsFactory carPartsFactory;

    public GenesisFactory(CarPartsFactory carPartsFactory) {
        this.carPartsFactory = carPartsFactory;
    }

    @Override
    public Car createCar() {
        Car car = new GenesisCar();
        car.setHandle(carPartsFactory.createHandle());
        car.setWheel(carPartsFactory.createWheel());
        return car;
    }
}
