package com.edu.pattern.proxy.staticed;

public class StaticProxyTest {
    public static void main(String[] args) {
//        Person person = new Son();
        Person person = new Tom();
        Father father = new Father(person);
        father.findLove();
        father.food();
    }
}
