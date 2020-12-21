package com.example.demo.simplefactory;

public class WeChatPayment implements IPayment{
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
