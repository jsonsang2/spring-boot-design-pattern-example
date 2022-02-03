package com.example.springbootdesignpatternexample.flyweight;

/**
 * 값이나 색상은 extrinsit한 데이터라고 고려,
 * extrinsit한 곳에서 flyweight 객체(Font)를 참조
 */
public class Character {

    private char value;

    private String color;

    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
