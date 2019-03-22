package com.edu.pattern.decroator.batterCake;

public class Sausage extends DecroatorBatterCake {

    public Sausage(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+一根香肠";
    }

    @Override
    protected int price() {
        return super.price()+2;
    }
}
