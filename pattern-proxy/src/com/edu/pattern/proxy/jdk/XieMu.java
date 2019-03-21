package com.edu.pattern.proxy.jdk;

import com.edu.pattern.proxy.staticed.Person;

public class XieMu implements Person {


    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("胸大，6块腹肌");
    }

    @Override
    public void food() {

    }

    @Override
    public void zufangzi() {

    }

    @Override
    public void buy() {

    }

    @Override
    public void findJob() {
        System.out.println("月薪20K");
    }
}
