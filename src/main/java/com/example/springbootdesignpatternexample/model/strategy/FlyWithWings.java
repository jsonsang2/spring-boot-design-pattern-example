package com.example.springbootdesignpatternexample.model.strategy;

public class FlyWithWings implements FlyBehavior{

    @Override
    public String fly() {
        System.out.println("I am Flying");
        return "I am Flying";
    }
}
