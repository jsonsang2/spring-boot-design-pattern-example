package com.example.springbootdesignpatternexample.model.strategy;

import lombok.Setter;

@Setter
public abstract class Duck {

    protected FlyBehavior flyBehavior;        // Object Composition : 다른 객체에 대한 Reference 를 한 객체가 가지고 있음
    protected QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public String performFly() {
        return flyBehavior.fly();                  // Delegation : Composition 관계를 이용해서 해당 객체에 내가 할 일을 맡긴다.
    }

    public String performQuack() {
        return quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoy!");
    }

}
