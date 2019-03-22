package com.edu.pattern.observer.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信公众号服务
 * 被观察者的具体实现
 */
public class WeChatServer implements Observerable {

    private List<Observer> list;
    private String message;

    public WeChatServer(){
        list = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(!list.isEmpty())
            list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(int i =0;i<list.size();i++){
            Observer observer = list.get(i);
            observer.update(message);
        }
    }

    public void setInfomation(String s){
        this.message =s;
        System.out.println("微信服务更新消息："+s);
        //消息更新
        notifyObserver();
    }


}
