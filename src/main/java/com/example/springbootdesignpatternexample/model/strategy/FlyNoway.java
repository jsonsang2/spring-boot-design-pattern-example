package com.example.springbootdesignpatternexample.model.strategy;

public class FlyNoway implements FlyBehavior{

    @Override
    public String fly() {
        System.out.println("I can't fly");
        return "I can't fly";
    }
}
