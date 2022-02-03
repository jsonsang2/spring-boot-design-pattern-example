package com.example.springbootdesignpatternexample.proxy;

public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("이 자리에 오신 여러분 진심으로 환영합니다.");
    }
}
