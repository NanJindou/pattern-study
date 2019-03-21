package com.edu.pattern.proxy.cglib;

import com.edu.pattern.proxy.staticed.Person;

public class CgilbTest {

    public static void main(String[] args) {
        try {
            Person obj = (Person)new CglibMeipo().getInsatnce(ZhangSan.class);
            obj.findLove();
            System.out.println(obj.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
