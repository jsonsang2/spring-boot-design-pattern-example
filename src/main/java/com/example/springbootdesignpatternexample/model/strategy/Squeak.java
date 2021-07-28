package com.example.springbootdesignpatternexample.model.strategy;

public class Squeak implements QuackBehavior{

    @Override
    public String quack() {
        System.out.println("Squeak");
        return "Squeak";
    }
}
