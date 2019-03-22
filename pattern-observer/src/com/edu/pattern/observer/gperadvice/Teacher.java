package com.edu.pattern.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Teacher  implements Observer {


    private String name;
    public Teacher(String name){
        this.name = name;
    }
    @Override
    public void update(Observable o, Object arg) {
        Gper gper = (Gper)o;
        Question question = (Question)arg;
        System.out.println("===========================");
        System.out.println(name+"老师，你好\n"+
        "你收到了一个来自"+gper.getName()+"的提问。问题是:"+question.getQuestion()+"\n"+
        "提问人是："+question.getName());
    }
}
