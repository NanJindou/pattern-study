package com.edu.pattern.singleton.register;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册登记式单例：
 * 每使用一次，都往一个固定的容器中去注册并且将使用过的对象进行缓存，下次取对象的时候，就直接从缓存中取值，以保证每次获取的都是同一个对象
 * IOC的单例模式就是典型的注册登记式单例
 */
public class RegisterMap {


    private static Map<String,Object> register = new HashMap<String,Object>();

    private RegisterMap(){}

    public static RegisterMap getInstance(String name){
        if(name ==null){
            name = RegisterMap.class.getName();
        }
        if(register.get(name)==null){
            try {
//                register.put(name,RegisterMap.class.newInstance());
                register.put(name,new RegisterMap());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (RegisterMap)register.get(name);

    }

}
