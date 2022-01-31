package com.example.springbootdesignpatternexample.factorymethod;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();

        /**
         * Client 코드는 바뀔 수 있다.
         * 각 Factory Class들을 알고있어야 하기 때문에, Client 코드는 바뀔 여지가 있다.
         * 우선 주목해야할 점은, 기능들을 확장할 때, 기존의 Class들이 변경이 없다는 점에 주목해야한다.
         *
         * Client 코드가 변경되는 부분은 interface를 사용한 구현을 이용해 일종의 dependency injection 방식을 사용해주면 된다.
         */
        Car gv70 = new GenesisCarFactory().orderCar("GV70", "jsonsang2@mail.com");
        System.out.println(gv70);

        Car sportage = new KiaCarFactory().orderCar("Sportage", "jsonsang2@mail.com");
        System.out.println(sportage);


        /**
         * 위 Client 코드가 변경되는 부분은 아래처럼 변경 가능하다.
         */

        client.print(new GenesisCarFactory(), "GV70", "jsonsang2@mail.com");
        client.print(new KiaCarFactory(), "Sportage", "jsonsang2@mail.com");
    }

    private void print(CarFactory carFactory, String name, String email) {
        System.out.println(carFactory.orderCar(name, email));
    }
}
