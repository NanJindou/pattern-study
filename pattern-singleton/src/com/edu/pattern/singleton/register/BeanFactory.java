package com.edu.pattern.singleton.register;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册登记式单例：
 * 每使用一次，都往一个固定的容器中去注册并且将使用过的对象进行缓存，下次取对象的时候，就直接从缓存中取值，以保证每次获取的都是同一个对象
 * IOC的单例模式就是典型的注册登记式单例
 */
public class BeanFactory {

    //保证线程安全
    private static Map<String,Object> ioc = new
            ConcurrentHashMap <String,Object>();

    private BeanFactory(){}

    public static Object getBean(String className){
        if(!ioc.containsKey(className)){
            Object obj= null;
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
            }catch(Exception e){
                e.printStackTrace();
            }
            return obj;
        }
         return ioc.get(className);

    }

}
