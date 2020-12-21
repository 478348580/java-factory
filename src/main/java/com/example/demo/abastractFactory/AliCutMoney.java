package com.example.demo.abastractFactory;

public class AliCutMoney implements ICutMoney {

    @Override
    public void cutMoney() {
        System.out.println("支付宝付款");
    }
}
