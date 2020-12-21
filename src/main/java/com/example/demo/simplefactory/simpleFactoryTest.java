package com.example.demo.simplefactory;

public class simpleFactoryTest {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        IPayment payment = paymentFactory.create(WeChatPayment.class);
        payment.pay();
    }
}
