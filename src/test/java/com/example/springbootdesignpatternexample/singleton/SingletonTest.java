package com.example.springbootdesignpatternexample.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SingletonTest {

    @Test
    @DisplayName("[Singleton] Singleton getInstance test")
    void getInstanceTest() {

        // Given
        Settings settings = Settings.getInstance();

        // When && Then
        assertThat(settings).isEqualTo(Settings.getInstance());
    }

}