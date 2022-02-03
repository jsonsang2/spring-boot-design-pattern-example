package com.example.springbootdesignpatternexample.proxy;

public class GameServiceProxy implements GameService {

    private GameService gameService;    // 기존코드 재사용을 위해 갖고있다.

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() {

        // Lazy Initialization
        // 권한체크 등 추가 가능

        long before = System.currentTimeMillis();
        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
