package com.edu.pattern.decroator.batterCake;

public class DecroatorTest {

    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();

        Egg egg = new Egg(batterCake);
        Egg egg2 = new Egg(batterCake);
        Sausage sausage =new Sausage(egg2);

        System.out.println(sausage.getMsg()+":"+sausage.price());
    }



}
