package com.edu.pattern.factory.FactoryMethod;

public class FactoryTest {

    public static void main(String[] args) {

        //配置，可能会配置错
        Factory factory = new TelunsuFactory();
        System.out.println(factory.getMilk());
    }

}
