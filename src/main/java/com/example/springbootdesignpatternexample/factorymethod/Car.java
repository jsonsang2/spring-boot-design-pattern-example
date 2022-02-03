package com.example.springbootdesignpatternexample.factorymethod;

import com.example.springbootdesignpatternexample.abstractfactory.Handle;
import com.example.springbootdesignpatternexample.abstractfactory.Wheel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Car {

    private String name;
    private String color;
    private String logo;
    private Wheel wheel;
    private Handle handle;
}
