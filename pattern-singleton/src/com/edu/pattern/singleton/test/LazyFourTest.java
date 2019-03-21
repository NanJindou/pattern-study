package com.edu.pattern.singleton.test;

import com.edu.pattern.singleton.lazy.LazyFour;
import com.edu.pattern.singleton.lazy.LazyThree;

import java.lang.reflect.Constructor;

public class LazyFourTest {


    public static void main (String[] args){

        try{
            //进行破坏
            Class<?> clazz =LazyFour.class;
            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            // 强制访问
            c.setAccessible(true);
            //暴力初始化
            Object obj1 = c.newInstance();
            //调用了两次构造方法，相当于new了两次
            Object obj2 = c.newInstance();
            System.out.println(obj1 == obj2);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
