package com.edu.pattern.observer.proxyJDK;

import com.edu.pattern.observer.mouse.MouseEventCallback;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMouseEventCallback implements InvocationHandler {

    //被代理的对象
    private MouseEventCallback target;

    public  Object getInstance(MouseEventCallback target) throws Exception{
        this.target =target;
        Class<?> clazz = target.getClass();

        //用于生成一个新的对象
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(this.target,args);
        return null;
    }
}
