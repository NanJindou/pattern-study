package com.edu.pattern.factory.AbstractFactory;

import com.edu.pattern.factory.Milk;
import com.edu.pattern.factory.Telunsu;
import com.edu.pattern.factory.YiLi;

public class MilkFactory  extends  AbstractFactory{
    @Override
    public Milk getTelunsu() {
        return new Telunsu();
    }

    @Override
    public Milk getYiLi() {
        return new YiLi();
    }
}
