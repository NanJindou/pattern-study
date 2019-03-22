package com.edu.pattern.template.proxy;

import com.edu.pattern.template.RowMapper;

import javax.sql.DataSource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 通过动态代理实现模板
 */
public class ProxyTemplate implements InvocationHandler {


    //被代理的对象，把引用保存下来
    private Person target;


    public Object getInstance(Person xiemu)throws Exception{
        this.target =xiemu;
        Class<?> clazz = target.getClass();
        //用来生成一个新的对象（字节码重组来实现）
        //  getInterfaces() 确定此对象所表示的类或接口实现的接口。
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),  this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理扩展

        Double money = target.checkMoney();
        //2.判断是否可以购买
        Product product=(Product)args[0];
        if(money>product.getPrice()){
            System.out.println("可以购买");
        }else{
            System.out.println("无法购买");
            return null;
        }
        //3、减去金额
        method.invoke(this.target,args);

        return null;
    }


}
