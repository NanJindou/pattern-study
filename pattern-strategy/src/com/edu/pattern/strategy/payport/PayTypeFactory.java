package com.edu.pattern.strategy.payport;

import java.util.HashMap;
import java.util.Map;

public class PayTypeFactory {

    private static Map<String,Payment> Payment = new HashMap<String,Payment>();

    static {
        Payment.put("ALI_PAY",new AliPay());
        Payment.put("WECHAT_PAY",new WechatPay());
        Payment.put("UNION_PAY",new UnionPay());
        Payment.put("JD_PAY",new JDPay());
    }

    private PayTypeFactory(){

    }

    public static Payment getPayment(String paymentKey){
        Payment payment = Payment.get(paymentKey);
        if(payment==null){
            return new UnionPay();
        }
        return payment;
    }






}
