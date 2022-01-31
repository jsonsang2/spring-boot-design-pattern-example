package com.example.springbootdesignpatternexample.abstractfactory;

public class WhitePartsFactory implements CarPartsFactory {

    @Override
    public Handle createHandle() {
        return new WhiteHandle();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
