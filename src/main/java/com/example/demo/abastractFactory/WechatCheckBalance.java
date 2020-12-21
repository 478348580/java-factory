package com.example.demo.abastractFactory;

public class WechatCheckBalance implements ICheckBalance{
    @Override
    public void check() {
        System.out.println("查看微信里的余额");
    }
}
