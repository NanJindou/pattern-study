package com.edu.pattern.observer.guava;

import com.edu.pattern.observer.gperadvice.Gper;
import com.edu.pattern.observer.gperadvice.Question;
import com.google.common.eventbus.EventBus;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Teacher  {


    private String name;
    public Teacher(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();

        Question question = new Question("小明","装饰者模式和适配器模式有什么区别");
        GperGuava gperGuava = GperGuava.getInstance();
        eventBus.register(gperGuava);
        eventBus.post(question);

        //Strust面向的类，而SpringMVC面向是方法
    }
}
