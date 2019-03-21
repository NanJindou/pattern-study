package com.edu.pattern.factory.simple;

import com.edu.pattern.factory.Milk;
import com.edu.pattern.factory.Telunsu;
import com.edu.pattern.factory.YiLi;

//简单工厂
public class SimpleFactory {

    public Milk getMilk(String name){
        if(name.equals("特仑苏")) {
            return new Telunsu();
        }else if(name.equals("伊利")) {
            return new YiLi();
        }
        return null;
    }
}
