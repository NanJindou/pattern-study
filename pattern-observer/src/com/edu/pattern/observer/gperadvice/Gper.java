package com.edu.pattern.observer.gperadvice;

import java.util.Observable;

/**
 * JDK 提供的观察者实现方式
 * Observable：被观察
 */
public class Gper extends Observable {

    private static Gper gper =null;

    private Gper(){}

    public static Gper getInstance(){
        if(gper==null){
            gper = new Gper();
        }
        return gper;
    }

    private String name="Gper生态圈";

    public String getName(){
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println("提问人："+question.getName()+"提问了"+question.getQuestion());
        setChanged();
        notifyObservers(question);
    }

}
