package com.example.demo.simplefactory;

public class OverseasPayment implements IPayment{
    @Override
    public void pay() {
        System.out.println("境外支付");

    }
}
