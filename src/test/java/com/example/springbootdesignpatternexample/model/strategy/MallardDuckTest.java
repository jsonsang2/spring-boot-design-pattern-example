package com.example.springbootdesignpatternexample.model.strategy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MallardDuckTest {

    @Test
    void mallardDuckTest() {

        // Given
        MallardDuck mallardDuck = new MallardDuck();

        // When
        String fly = mallardDuck.performFly();

        // Then
        assertThat(fly).isEqualTo("I am Flying");

        // when
        mallardDuck.setFlyBehavior(new FlyNoway());
        fly = mallardDuck.performFly();

        // Then
        assertThat(fly).isEqualTo("I can't fly");

    }

}