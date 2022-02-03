package com.example.springbootdesignpatternexample.bridge;

public class WinterSkinAri implements Champion {

    @Override
    public void move() {
        System.out.println("Winter Skin Ari Move");
    }

    @Override
    public void skillQ() {
        System.out.println("Winter Skin Ari Q");
    }

    @Override
    public void skillW() {
        System.out.println("Winter Skin Ari W");
    }

    @Override
    public void skillE() {
        System.out.println("Winter Skin Ari E");
    }

    @Override
    public void skillR() {
        System.out.println("Winter Skin Ari R");
    }
}
