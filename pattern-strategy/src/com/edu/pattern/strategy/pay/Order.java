package com.edu.pattern.strategy.pay;

import com.edu.pattern.strategy.payport.PayType;
import com.edu.pattern.strategy.payport.PayTypeFactory;
import com.edu.pattern.strategy.payport.Payment;

public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid,String orderId,double amount){
        this.amount=amount;
        this.uid = uid;
        this.orderId = orderId;
    }



    //这个参数完全可以用接口代替
    //但是这样完美的解决了switch的过程，不需要在代码中写switch
    public PayState pay(Payment payment){
        return payment.pay(uid,amount);
    }
}
