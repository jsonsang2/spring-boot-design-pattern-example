# Factory Method 패턴

- 구체적으로 어떤 인스턴스를 만들지는 서브클래스가 정한다.
- Open-Closed Principle 에 따라서 확장을하게됐을 때, 코드의 변화는 없게끔 만들어 줘야한다.
  `기존 코드를 건드리지 않고`, `확장을 하는 방법!!!`이 필요하다!!

## 목표

### 1. 팩토리 메서드 패턴을 적용했을 때의 장점은? 단점은?

#### 1-1. 장점

- Open Close 원칙을 적용해, 기존의 코드를 변경하지 않고, 새로운 인스턴스를 다른 방법으로 확장이 가능하다.
- Product(Instance)와 Creator(Factory)간의 커플링을 느슨하게 가져가서 가능하다.

#### 1-2. 단점

- 각자의 역할을 나누다 보니 Class 수가 늘어난다.

### 2. 확장에 열려있고 변경에 닫혀있는 객체지향원칙을 설명하세요.

- 무엇이 닫혀있고, 무엇이 열려있는지에 대한 관점의 설명이 중요하다.
- 변경에 닫혀있다는 것은, 기존 코드를 변경하지 않는다는 것이다.
- 기존 코드를 변경하지 않으면서 새로운 기능을 확장할 수 있는 구조를 만든다.

### 3. 자바8에 추가된 default 메소드에 대해서 설병하세요.

- 자바8에 들어간 기능으로, interface에 들어갈 수 있는 메서드
- 해당 interface를 구현/상속받는 구현체에서도 사용 가능
- 자바9 버전에는 interface에 private method도 추가 가능하다. (private method가 추가 불가능하다면 해당 interface를 구현한 Default Class 같은 것을 두고, 해당
  Class를 상속해서 사용한다.)

## 실무

### 1. Java의 Calendar Class

```java
public abstract class Calendar implements Serializable, Cloneable, Comparable<Calendar> {
    public static Calendar getInstance() {
        Locale aLocale = Locale.getDefault(Locale.Category.FORMAT);
        return createCalendar(defaultTimeZone(aLocale), aLocale);
    }

    public static Calendar getInstance(TimeZone zone) {
        return createCalendar(zone, Locale.getDefault(Locale.Category.FORMAT));
    }

    public static Calendar getInstance(Locale aLocale) {
        return createCalendar(defaultTimeZone(aLocale), aLocale);
    }
}
```

### 2. Spring Framework의 BeanFactory

```java
public class Test {

    public static void main(String[] args) {

        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
        String hello = xmlFactory.getBean("hello", String.class);
        System.out.println(hello);

        BeanFactory javaFactory = new AnnotationConfigApplicationContext(Config.class);
        String hi = javaFactory.getBean("hello", String.class);
        System.out.println(hi);
    }
}
```용