package com.example.springbootdesignpatternexample.flyweight;

public class Client {

    public static void main(String[] args) {

        /*
        * Previous Code
        *
        Character c1 = new Character('h', "white", "nanum", 12);
        Character c2 = new Character('e', "white", "nanum", 12);
        Character c3 = new Character('l', "white", "nanum", 12);
        */

        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('l', "white", fontFactory.getFont("nanum:12"));
    }
}
