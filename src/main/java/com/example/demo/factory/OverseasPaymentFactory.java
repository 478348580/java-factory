package com.example.demo.factory;

import com.example.demo.simplefactory.IPayment;
import com.example.demo.simplefactory.OverseasPayment;

public class OverseasPaymentFactory implements IPaymentFactory{
    @Override
    public IPayment create() {
        return new OverseasPayment();
    }
}
