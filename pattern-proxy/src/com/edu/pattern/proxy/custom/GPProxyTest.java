package com.edu.pattern.proxy.custom;

import com.edu.pattern.proxy.jdk.JDK58;
import com.edu.pattern.proxy.jdk.XieMu;
import com.edu.pattern.proxy.staticed.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class GPProxyTest {
    public static void main(String[] args) {
        try {
            //只能实现接口
            Person object = (Person) new CustomMeipo().getInstance(new XieMu());
            System.out.println(object.getClass());
            object.findJob();







        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
