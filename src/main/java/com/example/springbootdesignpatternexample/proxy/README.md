# [구조적인 패턴] Proxy pattern

![image](./pattern.png)

- Proxy는 대리인이라는 뜻이다.
- 특정한 객체의 operation들을 접근하기 전에 Proxy 객체를 먼저 지나서 접근하는 패턴
- 클라이언트가 원래 사용하려고 했던 Operation을 직접 사용하는 것이 아니라 Proxy라는 중간 대리인을 거쳐서 사용하게 된다.
- 접근제어, 초기화지연, 로깅, 캐싱 등에 사용될 수 있다.
- Decorator 패턴과 생김새가 매우 비슷하다.

## 장단점

### 장점

- 애플리케이션에서 사용하는 메모리를 줄일 수 있다.

### 단점

- 복잡도가 증가해서 Facade pattern에 대한 사전지식이 없을 경우에 코드에 대한 이해가 어려워질 수 있다.

## 실무

도메인 관련해서 메모리를 최적화하기 윈한 패턴이라 찾기가 쉽지는 않다.

### Java valueOf

> Cache to support the object identity semantics of autoboxing for values between -128 and 127 (inclusive) as required by JLS. The cache is initialized on first usage. The size of the cache may be controlled by the {@code -XX:AutoBoxCacheMax=<size>} option. During VM initialization, java.lang.Integer.IntegerCache.high property may be set and saved in the private system properties in the jdk.internal.misc.VM class.

- Java Integer의 valueOf는 특정 범위의 숫자를 캐싱해서 사용한다.