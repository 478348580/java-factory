package com.example.demo.factory;

import com.example.demo.simplefactory.IPayment;

public class FactoryTest {
    public static void main(String[] args) {
        IPaymentFactory paymentFactory = new AliPaymentFactory();
        IPayment payment=paymentFactory.create();
        payment.pay();

        paymentFactory = new OverseasPaymentFactory();
        payment = paymentFactory.create();
        payment.pay();
    }
}
