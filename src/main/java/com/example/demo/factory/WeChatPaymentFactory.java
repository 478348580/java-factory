package com.example.demo.factory;

import com.example.demo.simplefactory.IPayment;
import com.example.demo.simplefactory.WeChatPayment;

public class WeChatPaymentFactory implements IPaymentFactory{
    @Override
    public IPayment create() {
        return new WeChatPayment();
    }
}
