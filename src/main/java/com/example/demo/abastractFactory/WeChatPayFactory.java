package com.example.demo.abastractFactory;

public class WeChatPayFactory extends PaymentFactory{
    @Override
    protected ICutMoney createCutMoney() {
        return new WeChatCutMoney();
    }

    @Override
    protected ICheckBalance checkBalance() {
        return new WechatCheckBalance();
    }
}
