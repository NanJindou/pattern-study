package com.edu.pattern.observer.subject;

import com.edu.pattern.observer.core.EventListener;

/**
 * 被观察者
 */
public class Subject extends EventListener {

    //通常的话，采用动态代理来实现监控，避免代码侵入
    public void add(){
        System.out.println("调用一个添加的方法");
        trigger(SubjectEventType.ON_ADD);
    }

    public void remove(){
        System.out.println("调用删除的方法");
        trigger(SubjectEventType.ON_RMOVE);
    }
}
