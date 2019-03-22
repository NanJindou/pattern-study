package com.edu.pattern.observer.proxyJDK;

import com.edu.pattern.observer.core.Event;
import com.edu.pattern.observer.mouse.Mouse;
import com.edu.pattern.observer.mouse.MouseEventCallback;
import com.edu.pattern.observer.mouse.MouseEventType;

import java.lang.reflect.Method;

public class JDKTest {
    public static void main(String[] args) {

        try {
            //观察者
//            MouseEventCallback mouseEventCallback = new MouseEventCallback();
            //观察者的方法、
//            Method onClickmethod = MouseEventCallback.class.getMethod("onClick", Event.class);
            //观察者
            MouseEventCallback object = (MouseEventCallback) new JDKMouseEventCallback().getInstance(new MouseEventCallback());
            System.out.println(object.getClass());


            //被观察者
            Mouse mouse = new Mouse();
            //绑定方法  key ，观察者 ，方法
//            mouse.addLisenter(MouseEventType.ON_CLICK, object,);

            mouse.click();


        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
