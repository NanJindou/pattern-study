package com.edu.pattern.proxy.jdk;

import com.edu.pattern.proxy.staticed.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class JDKProxyTest {

    public static void main(String[] args) {
//        try {
//            //只能实现接口
//            Person object = (Person) new JDKMeiPo().getInstance(new XieMu());
//            object.findLove();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            //只能实现接口
            Person object = (Person) new JDK58().getInstance(new XieMu());
            System.out.println(object.getClass());
            object.findJob();

            //代码生成器
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://javaStudy//$Proxy0.class");
            os.write(bytes);






        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
