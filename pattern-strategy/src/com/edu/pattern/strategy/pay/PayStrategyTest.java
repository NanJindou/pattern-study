package com.edu.pattern.strategy.pay;

import com.edu.pattern.strategy.payport.PayType;
import com.edu.pattern.strategy.payport.PayTypeFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class PayStrategyTest {
    public PayStrategyTest() {
        super();
    }

    public static void main(String[] args) {
        Order order = new Order("1","20181119120400000001",10.0);
        //开始支付：选择微信支付、支付宝、银联卡、财付通
        //基本算法是固定的，但是具有选择权（state没有选择权）
        System.out.println(order.pay(PayTypeFactory.getPayment("JD_PAY")));


        //BeanFactory
        //ListableFactory

        //根据url去自动选择
        //爬取百度数据 ：baiduParser
        //               SinaParser
        //返回一个解析好的JSON格式，统一好了
    }



}
