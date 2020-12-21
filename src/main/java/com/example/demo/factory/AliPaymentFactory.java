package com.example.demo.factory;

import com.example.demo.simplefactory.AliPayment;
import com.example.demo.simplefactory.IPayment;

public class AliPaymentFactory implements IPaymentFactory{
    @Override
    public IPayment create() {
        return new AliPayment();
    }
}
