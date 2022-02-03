package com.example.springbootdesignpatternexample.factorymethod;

import org.springframework.util.StringUtils;

public interface CarFactory {

    default Car orderCar(String name, String email) {
        // 간결해졌다, Method 이름들로 동작들을 유츄할 수 있다.
        // 코드를 하나의 메서드에 밀어넣고 주석으로 처리하는 것보다 좋다.
        validate(name, email);
        prepareFor(name);
        Car car = createCar();
        sendEmailTo(email, car);
        return car;
    }

    Car createCar();

    private void sendEmailTo(String email, Car car) {
        System.out.println(car.getName() + "생성완료!");
    }

    private void prepareFor(String name) {
        System.out.println("Prepare to order a car");
    }

    private void validate(String name, String email) {
        if (!StringUtils.hasText(name)) {
            throw new IllegalArgumentException("No car name");
        }
        if (!StringUtils.hasText(email)) {
            throw new IllegalArgumentException("No email");
        }
    }


}
