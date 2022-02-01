# [객체생성과 관련된 디자인패턴] 추상팩토리 패턴

- 서로 관련된 여러 객체를 만들어주는 인터페이스
- 구체적으로 어떤 클래스의 인스턴스를(concrete product)를 사용하는지 감출 수 있다.
- 구체적인 팩토리에서 구체적인 인스턴스를 만드는것 까지는 팩토리 매서드 피턴과 매우 비슷하지만 `초점이 팩토리를 사용하는 Client 쪽에 있다고 볼 수 있다.`
- 목적자체가 클라이언트 코드, 팩토리에서 인스턴스를 만들어 쓰는 코드를 인터페이스 기반으로 코딩할 수 있도록 도와주는 패턴이기 때문에 모양은 팩토리 쪽을 집중해서 보면 팩토리 매서드 패턴과 매우 흡사하지만, 그
  팩토리를 사용하는 쪽 코드를 같이 봐야한다.

## 팩토리 메서드 패턴과의 비교

- `팩토리 메서드 패턴`은 객체를 만드는 과정에 좀 더 집중이 되어있다.
- `팩토리 메서드 패턴`과 `추상팩토리 패턴` 둘 다 객체를 추상화시킨건 맞다.
- 보는 관점이 구체적인 타입의 인스턴스를 만드는 과정을 concrete Factory로 숨기고 그 위에 추상화되어있는 concrete Factory를 제공하는 것을 팩토리 메서드 패턴이라고 볼 수 있고,
- 보는 과점을 조금 다르게 해서 Client 관점에서 Factory를 통해서 추상화된 인터페이스만 클라이언트가 쓸 수 있게끔 해주기 때문에 Client 입장에서 Concrete Class를 직접 참조해서 쓸 필요가
  없어진다.

### 비슷

- 둘 다 구체적인 객체 생성 과정을 추상화한 인터페이스를 제공한다.

### 관점의 차이

- `팩토리 메서드 패턴`은 팩토리를 구현하는 방법(inheritance)에 초점을 둔다.
- `추상팩토리 패턴`은 팩토리를 사용하는 방법(Composition)에 초점을 둔다.

### 목적의 차이

- `팩토리 메서드 패턴`은 구체적인 객체 생성 과정을 하위 또는 구체적인 클래스로 옮기는 것이 목적
- `추상팩토리 패턴`은 관련있는 여러 객체를 구체적인 클래스에 의존하기 않고 만들 수 있게 해주는 것이 목적

## 실무

### 1. Java

- javax.xml.xpath.XPathFactory#newInstance()
- javax.xml.transform.TransformerFactory#newInstance()
- javax.xml.parsers.DocumentBuilderFactory#newInstance()

### 2. Spring Framework의 FactoryBean

- CarFactory가 추상 팩토리 인터페이스에 해당
- 클라이언트에 해당하는 부분, FactoryBean을 사용해서 Car를 빈으로 등록해주는 부분은 Spring Framework 내부 코드에 있다.
- 아래 코드는 CarFactory getObject()에서 반환하는 Car가 빈으로 등록된다.

```java
public class CarFactory implements FactoryBean<Car> {

    @Override
    public Car getObject() throws Exception {
        Car car = new GenesisCar();
        car.setName("gv70");
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }
}
```