package com.example.demo.abastractFactory;

public class AliPayFactory extends PaymentFactory {
    @Override
    protected ICutMoney createCutMoney() {
        return new AliCutMoney();
    }

    @Override
    protected ICheckBalance checkBalance() {
        return new AliCheckBalance();
    }
}
