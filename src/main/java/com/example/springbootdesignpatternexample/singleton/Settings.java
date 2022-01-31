package com.example.springbootdesignpatternexample.singleton;

public class Settings {

    // Private 생성자를 만들어서 외부에서 new를 통해서 새로운 인스턴스를 못만들게 해준다.
    private Settings() {
    }
    
    /**
     * 밖에서 인스턴스를 만들 수 없기 때문에 Global Access가 가능하도록 방법을 제공해야한다.
     * static 을 사용하면 된다.
     *
     * - MultiThread 환경에서 문제를 갖는다.
     *
     * private static Settings instance;
     * public static Settings getInstance() {
     *         if (instance == null) {
     *             instance = new Settings();
     *         }
     *         return instance;
     *     }
     *
     */


    /**
     * 1. MultiThread 환경에서의 방법 : synchronized 사용하기.
     * <p>
     * MultiThread 환경에서 Thread Safe하게 사용할 수 있다.
     * 다만 매번 getInstance() 호출할 때마다 동기화 처리하는 작업때문에 성능에 불이득이 생길 수 있다.
     * 동기화 매커니즘 자체가 Lock을 사용하는 매커니즘을 사용하기 때문에 성능부하의 여지가 있음.
     * <p>
     *
     * public static synchronized Settings getInstance() {
     * if (instance == null) {
     * instance = new Settings();
     * }
     * return instance;
     * }
     */

    /**
     * 2. MultiThread 환경에서의 방법 : eager initialization 사용하기
     * 미리 만들어드는데 부담?이 없다면 요 방법도 Thread Safe하게 사용할 수 있다.
     * 인스턴스를 만드는 과정이 길고, 오래걸리고, 메모리를 많이 사용할 뿐만아니라 사용이 안되는 경우에는 비효율적일 수 있다.
     *
     * private final static Settings INSTANCE = new Settings();
     *
     * public static Settings getInstance() {
     *   return instance;
     * }
     *
     */

    /**
     * 3. MultiThread 환경에서의 방법 : Double checked locking
     * <p>
     * - synchronized 블럭을 사용하기에는 조금 부담스럽고, 인스턴스 생성을 실제 사용할때 하기위해서 사용하는 방법
     * - getInstance를 호출할때마다 synchronized를 사용하는게 아니라서 더 효율적이다.
     * - `volatile` 키워드 때문에 자바 1.5부터 사용가능하다.
     *
     * private static volatile Settings instance;
     *
     *     public static Settings getInstance() {
     *         if (instance == null) {
     *             synchronized (Settings.class) {
     *                 if (instance == null) {
     *                     instance = new Settings();
     *                 }
     *             }
     *         }
     *         return instance;
     *     }
     */

    /**
     * 4. MultiThread 환경에서의 방법 : static inner class 사용
     * <p>
     * - Lazy Loading이 가능하다.
     * - `volatile`을 사용한 메모리에 대한 이해가 필요없고, 자바 버전에 대한 디펜던시가 없다.
     * - 코드가 간단하다.
     */

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
