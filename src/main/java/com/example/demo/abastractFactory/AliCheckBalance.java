package com.example.demo.abastractFactory;

public class AliCheckBalance implements ICheckBalance{
    @Override
    public void check() {
        System.out.println("查看支付宝里的余额");
    }
}
