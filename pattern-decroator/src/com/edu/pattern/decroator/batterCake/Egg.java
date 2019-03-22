package com.edu.pattern.decroator.batterCake;

public class Egg extends   DecroatorBatterCake{


    public Egg(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1个鸡蛋";
    }

    @Override
    protected int price() {
        return super.price()+1;
    }
}
