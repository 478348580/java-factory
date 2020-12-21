package com.example.demo.abastractFactory;

public class WeChatCutMoney implements ICutMoney{
    @Override
    public void cutMoney() {
        System.out.println("微信付款");
    }
}
