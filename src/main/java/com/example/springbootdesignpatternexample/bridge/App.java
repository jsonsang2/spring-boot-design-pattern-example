package com.example.springbootdesignpatternexample.bridge;

public class App {

    public static void main(String[] args) {
        /**
         * Client 코드가 추상적인 부분만 보고있지 않은 것 같다는 의문이 생길 수 있다,
         * 지금은 interface 부분만 사용하고 있는건 맞다. `new Ari(new WinterSkin());` 이 부분은 의존성을 주입해주는 방식으로 얼마든지 감출 수 있다.
         * Client 코드는 `Champion`만 사용하게끔 변경이 가능하다.
         */
        Champion winterAri = new Ari(new WinterSkin());
        winterAri.skillQ();
        winterAri.skillE();

        Champion summerAri = new Ari(new SummerSkin());
        summerAri.skillR();
        summerAri.skillR();
    }
}
