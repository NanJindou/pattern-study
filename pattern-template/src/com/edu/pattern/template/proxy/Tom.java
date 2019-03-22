package com.edu.pattern.template.proxy;

public class Tom implements Person {

     private Double money = 100.0;
    @Override
    public Double checkMoney() {
        return money;
    }

    @Override
    public void buy(Product product) {
        this.money=money-product.getPrice();
        System.out.println("Tom还剩："+money);
    }
}
