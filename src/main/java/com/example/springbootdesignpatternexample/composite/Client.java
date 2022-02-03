package com.example.springbootdesignpatternexample.composite;

public class Client {

    public static void main(String[] args) {
        Item dranBlade = new Item("도란검", 450);
        Item healPosition = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(dranBlade);
        bag.add(healPosition);

        Client client = new Client();
        client.printPrice(dranBlade);
        client.printPrice(bag);
    }

    /**
     * Client는 구체적인 정보를 알 필요가 없다.(가격을 어떻게 구할지 자세히 알 필요가 없다)
     * 가격을 어떻게 구할지는 Composite / Leaf 객체가 알고있다.
     * Client는 Component interface에 위임만 하면된다.
     * <p>
     * 전체나 부분이나 동일하게 취급할 수 있는 트리구조의 계층구조가 된다.
     */
    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
