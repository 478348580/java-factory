package com.example.demo.simplefactory;

public class PaymentFactory {
    public IPayment create(Class<? extends IPayment> className){
//        if("ali".equals(payType)){
//            return new AliPayment();
//        }
//        if("weChat".equals(payType)){
//            return new WeChatPayment();
//        }
//        if("cash".equals(payType)){
//            return new CashPayment();
//        }
//        if("overseas".equals(payType)){
//            return new OverseasPayment();
//        }
        if(className != null){
            try {
                return className.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
