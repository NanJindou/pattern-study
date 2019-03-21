package com.edu.pattern.factory.FactoryMethod;

import com.edu.pattern.factory.Milk;
import com.edu.pattern.factory.YiLi;

public class YiLiFactory implements  Factory {
    @Override
    public Milk getMilk() {
        return new YiLi();
    }
}
