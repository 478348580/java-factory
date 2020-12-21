package com.example.demo.abastractFactory;

public abstract class PaymentFactory {

    public void init(){
        System.out.println("初始化");
    }

    protected abstract ICutMoney createCutMoney();
    protected abstract ICheckBalance checkBalance();
}
