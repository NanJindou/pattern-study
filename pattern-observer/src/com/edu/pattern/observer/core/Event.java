package com.edu.pattern.observer.core;

import java.lang.reflect.Method;

public class Event {

    //事件源   被观察者 Subject
    private Object source;
    //通知目标  观察者
    private Object target;
    //回调    方法就是通知方法
    private Method callback;
    //触发  Map ->key
    private String trigger;

    private long time;

    public Event(Object target, Method callback) {
        //通知目标
        this.target = target;
        //回调
        this.callback =callback;
    }

    public Object getSource() {
        return source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    @Override
    public String toString() {
        return "Event{" +
                "\tsource=" + source +",\n"+
                "\ttarget=" + target +",\n"+
                "\tcallback=" + callback +",\n"+
                "\ttrigger='" + trigger + "\'\n" +
                '}';
    }

    public long getTime() {
        return time;
    }

    Event setTime(long time) {
        this.time = time;
        return this;
    }

    Event setSource(Object source) {
        this.source = source;
        return this;
    }

    Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

}
