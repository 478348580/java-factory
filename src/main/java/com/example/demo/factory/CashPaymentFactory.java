package com.example.demo.factory;

import com.example.demo.simplefactory.CashPayment;
import com.example.demo.simplefactory.IPayment;

public class CashPaymentFactory implements IPaymentFactory{
    @Override
    public IPayment create() {
        return new CashPayment();
    }
}
