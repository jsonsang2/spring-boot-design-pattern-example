package com.example.springbootdesignpatternexample.model.strategy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class DuckTest {

    @Test
    void duckSimulator() {

        // Given
        Duck mallard = new MallardDuck();

        // When
        String quack = mallard.performQuack();
        String fly = mallard.performFly();

        // Then
        assertThat(quack).isEqualTo("Quack");
        assertThat(fly).isEqualTo("I am Flying");
    }
}