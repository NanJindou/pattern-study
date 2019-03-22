package com.edu.pattern.decroator.batterCake;

public abstract class DecroatorBatterCake  extends BatterCake{

    //静态代理，委派
    //选择权交给用户
    private BatterCake batterCake;

    public DecroatorBatterCake(BatterCake batterCake){
        this.batterCake=batterCake;
    }

    @Override
    protected String getMsg() {
        return batterCake.getMsg();
    }

    @Override
    protected int price() {
        return batterCake.price();
    }
}
