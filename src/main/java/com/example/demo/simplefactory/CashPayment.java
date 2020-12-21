package com.example.demo.simplefactory;

public class CashPayment implements IPayment{
    @Override
    public void pay() {
        System.out.println("现金支付");
    }
}
