package com.example.springbootdesignpatternexample.abstractfactory;

public interface CarPartsFactory {

    Handle createHandle();

    Wheel createWheel();
}
