package com.edu.pattern.factory.AbstractFactory;

import com.edu.pattern.factory.Milk;

//抽象工厂  abstract class 抽象类

/**
 * 抽象工厂是用户的主入口
 * 在Spring中应用得最为广泛的一种设计模式
 * 易于扩展
 */
public abstract class AbstractFactory {

    /**
     * 获得一个特仑苏牛奶
     * @return
     */
    public abstract Milk getTelunsu();

    public abstract  Milk getYiLi();
}
