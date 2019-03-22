package com.edu.pattern.observer.subject;

import com.edu.pattern.observer.core.Event;

/**
 * 观察者
 */
public class Observer {

    public void advice(Event e){
        //显示Event
        System.out.println("================触发事件，打印日志====================\n" +e);

       /**
         * js页面中会用到  事件绑定
         * input
         * input.addLisenter("click",function(){
         *
         * });
         */
    }
}
