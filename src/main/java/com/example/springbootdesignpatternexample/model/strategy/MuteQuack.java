package com.example.springbootdesignpatternexample.model.strategy;

public class MuteQuack implements QuackBehavior{

    @Override
    public String quack() {
        System.out.println("<< silence >>");
        return "<< silence >>";
    }
}
