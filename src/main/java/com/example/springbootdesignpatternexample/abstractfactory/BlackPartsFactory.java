package com.example.springbootdesignpatternexample.abstractfactory;

public class BlackPartsFactory implements CarPartsFactory {

    @Override
    public Handle createHandle() {
        return new BlackHandle();
    }

    @Override
    public Wheel createWheel() {
        return new BlackWheel();
    }
}
