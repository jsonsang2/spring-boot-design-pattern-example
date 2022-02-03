package com.example.springbootdesignpatternexample.model.strategy;

public class Quack implements QuackBehavior{

    @Override
    public String quack() {
        System.out.println("Quack");
        return "Quack";
    }
}
