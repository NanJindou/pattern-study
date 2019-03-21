package com.edu.pattern.factory.simple;

import com.edu.pattern.factory.Telunsu;

public class Test {
    public static void main(String[] args){

        //这个new的过程实际上一个比较复杂的过程
        //最好让工厂new
        //  System.out.println(new Telunsu().getName() );

        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getMilk("特仑苏") );
        System.out.println(factory.getMilk("伊利") );
    }

}
