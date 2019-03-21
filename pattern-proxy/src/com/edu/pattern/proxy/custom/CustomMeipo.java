package com.edu.pattern.proxy.custom;

import com.edu.pattern.proxy.staticed.Person;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CustomMeipo implements GPInvocationHandler{

    //被代理的对象，把引用保存下来
    private Person target;
    public Object getInstance(Person xiemu)throws Exception{
        this.target =xiemu;
        Class<?> clazz = target.getClass();

        //用来生成一个新的对象（字节码重组来实现）
        //  getInterfaces() 确定此对象所表示的类或接口实现的接口。
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),  this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆，我要给你找对象，现在已经拿到你的需求了");
        System.out.println("开始物色");

        //调用方法
        method.invoke(this.target,args);
        System.out.println("如果合适的话，就准备办事");
        return null;
    }
}
