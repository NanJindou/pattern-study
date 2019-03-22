package com.edu.pattern.template.proxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        try {
            //只能实现接口
            Person object = (Person) new ProxyTemplate().getInstance(new Son());
            System.out.println(object.getClass());
            Product product = new Product(60.0,"鞋子");
            object.buy(product);

             Product product1 = new Product(15.0,"牙刷");
            object.buy(product1);






        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
