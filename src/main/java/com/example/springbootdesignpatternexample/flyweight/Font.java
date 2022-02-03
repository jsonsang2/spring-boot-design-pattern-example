package com.example.springbootdesignpatternexample.flyweight;

import lombok.Getter;

/**
 * Font를 자주 바뀌지 않는 intrinsit 한 flyweight라고 정의
 * flyweight에 해당하는 인스턴스는 immutable 해야한다.(여러 인스턴스에서 공유하는 데이터이기 때문에 값이 변경되면 안된다.)
 * 상속을 막아주기 위해서 class에 final을 붙힌다.
 */
@Getter
public final class Font {

    private final String family;

    private final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }
}
