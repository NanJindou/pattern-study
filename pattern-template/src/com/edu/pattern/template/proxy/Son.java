package com.edu.pattern.template.proxy;

public class Son  implements Person {
    private Double money = 50.0;

    @Override
    public Double checkMoney() {
        return money;
    }

    @Override
    public void buy(Product product) {
        this.money=money-product.getPrice();
        System.out.println("Son还剩："+money);
    }

}
