## 목표

### 1. Java에서 enum을 사용하지 않고, Singleton Pattern을 구현하는 방법은?

1. synchronized 사용하기.
2. eager initialization 사용하기
3. Double checked locking
4. static inner class 사용

### 2. private 생성자와 static 매서드를 사용하는 방법의 단점은?

- 잘못 구현하게되면, Multi Thread 환경에서 Thread Safe 하지 않을 수 있다.

### 3. enum을 사용해 싱글톤 패턴을 구현하는 방법의 장점과 단점은?

#### 장점

- 코드가 깔끔해진다.
- enum을 사용하면 기본적으로 private 생성자를 사용하게 된다.
- enum은 Reflection을 통해서 생성되는게 방지가 되어있어서 기본의 문제를 해결할 수 있다.

#### 단점

- 클래스 로딩 시, 인스턴스가 미리 만들어진다.
- 상속을 사용할 수 없다.(enum은 enum만 상속가능하다.)
- 상속을 사용하려면 static inner class를 사용해야한다.

### 4. static inner 클래스를 사용해 싱글턴 패턴을 구현하라.

```java
public class Settings {

    // Private 생성자를 만들어서 외부에서 new를 통해서 새로운 인스턴스를 못만들게 해준다.
    private Settings() {
    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
```

## Java와 Spring에서 사용된 Singleton Pattern

### 1. Java

- Runtime Class : `getRuntime()`이라는 static method로만 가져올 수 있다.

### 2. Spring

- Singleton scope