package com.example.demo.abastractFactory;

public class AbastractFactoryTest {
    public static void main(String[] args) {
        AliPayFactory factory = new AliPayFactory();
        factory.checkBalance().check();
        factory.createCutMoney().cutMoney();
    }
}
