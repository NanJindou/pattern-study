package com.edu.pattern.observer.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 被观察者的监听
 */
public class EventListener {
    //相当于一个注册器
    protected Map<Enum,Event> events = new HashMap<Enum,Event>();

    /**
     *
     * @param eventType key
     * @param target  观察者
     * @param callback  key对应的方法
     */
    public void addLisenter(Enum eventType,Object target,Method callback){
        //注册事件
        //用反射调用这个方法
        events.put(eventType,new Event(target,callback));

    }

    private void trigger(Event e){
        //事件源 EventLisenter
        e.setSource(this);
        e.setTime(System.currentTimeMillis());

        try {
            //Callback 回调  Method  ->Observer.advice
            //Target 通知目标  Observer
            // Method.invoke(Observer,方法类型);
            e.getCallback().invoke(e.getTarget(),e);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    protected void trigger(Enum call){
        //判断events 是否有key
        if(!this.events.containsKey(call)){
            return ;
        }
        //Trigger 触发  Enum  Map—>key
        trigger(this.events.get(call).setTrigger(call.toString()));
    }
}
