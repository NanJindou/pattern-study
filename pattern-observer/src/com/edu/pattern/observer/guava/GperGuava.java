package com.edu.pattern.observer.guava;

import com.edu.pattern.observer.gperadvice.Gper;
import com.edu.pattern.observer.gperadvice.Question;
import com.google.common.eventbus.Subscribe;

public class GperGuava {

    private static GperGuava gper =null;

    private GperGuava(){}

    public static GperGuava getInstance(){
        if(gper==null){
            gper = new GperGuava();
        }
        return gper;
    }

    private String name="Gper生态圈";

    public String getName(){
        return name;
    }

    @Subscribe
    public void publishQuestion(Question question){
        System.out.println("提问人："+question.getName()+ "在"+name+"上提问了："+question.getQuestion());

    }
}
