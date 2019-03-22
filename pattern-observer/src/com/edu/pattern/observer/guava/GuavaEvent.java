package com.edu.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * 被观察者
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subcribe方法，传入参数为："+str);
    }
}
