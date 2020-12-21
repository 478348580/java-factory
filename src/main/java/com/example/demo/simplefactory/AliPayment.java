package com.example.demo.simplefactory;

public class AliPayment implements IPayment{
    @Override
    public void pay() {
        System.out.println("阿里支付");
    }
}
