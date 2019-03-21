package com.edu.pattern.strategy.payport;

import com.edu.pattern.strategy.pay.PayState;

public interface Payment {

//    public static final  Payment Ali_Pay =new AliPay();
    public PayState pay(String uid , double amount);
}
