package com.edu.pattern.observer.mouse;

import com.edu.pattern.observer.core.Event;
import com.edu.pattern.observer.subject.Observer;

import java.lang.reflect.Method;

public class MouseTest {

    public static void main(String[] args) {
        /**
         * var input = document.getElementById("username");
         * input.addLisenter("oclick",function(){
         *      alert("鼠标点击了这个文本框");
         * });
         *
         *
         *
         */
        try {
            //观察者
            MouseEventCallback mouseEventCallback = new MouseEventCallback();
            //观察者的方法、
            Method onClickmethod = MouseEventCallback.class.getMethod("onClick", Event.class);


            //被观察者
            Mouse mouse = new Mouse();
            //绑定方法  key ，观察者 ，方法
            mouse.addLisenter(MouseEventType.ON_CLICK, mouseEventCallback,onClickmethod);

            mouse.click();


        }catch(Exception e){
            e.printStackTrace();
        }
        /**
         * 观察者和被观察者没有必然联系，只有注册事件的时候才有联系
         *
         *
         */

    }
}
