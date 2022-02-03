package com.example.springbootdesignpatternexample.singleton;

/**
 * Class로 Singleton을 만드는 경우에는 Reflection이나 직렬화를 통해서 오용을 할 수 있는 여지가 있다.
 * enum을 사용하면 기본적으로 private 생성자를 사용하게 된다.
 * enum은 Reflection을 통해서 생성되는게 방지가 되어있어서 기본의 문제를 해결할 수 있다.
 * <p>
 * <p>
 * 단점,
 * - enum은 클래스를 로딩하는 순간 instance가 미리 만들어진다. (이 방법이 크게 문제가 되지 않는다면 그래도 가장 완벽한 방법이 된다.)
 * - 직렬화 역직렬화가 미리 구현되어있어서 추가적인 구현이 없어도 오용을 피할 수 있다.
 */
public enum SettingsEnum {

    INSTANCE;
}
