package com.edu.pattern.observer.mouse;

import com.edu.pattern.observer.core.EventListener;

/**
 * 被观察者
 */
public class Mouse extends EventListener {


    public void click(){
        System.out.println("鼠标单击");

        //这一句代码实际上是侵入式代码
        // invoke（）
        //proxy 类，method参数值
        //根据所调用的方法去动态的判断触发哪个时间
        //也可以用到策略模式
        //事先配置好方法和触发时间的关联关系
        //Map<String,MouseEventType> map;
        //map.put("click",ON_CLICK)

        this.trigger(MouseEventType.ON_CLICK);
    }


    public void doubleClick(){
        System.out.println("鼠标双击");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }

    public void up(){
        System.out.println("鼠标弹起");
        this.trigger(MouseEventType.ON_UP);
    }

    public void down(){
        System.out.println("鼠标按下");
        this.trigger(MouseEventType.ON_DOWN);
    }


    public void wheel(){
        System.out.println("鼠标滚动");
        this.trigger(MouseEventType.ON_WHEEL);
    }

    public void move(){
        System.out.println("鼠标移动");
        this.trigger(MouseEventType.ON_MOVE);
    }

    public void over(){
        System.out.println("鼠标悬停");
        this.trigger(MouseEventType.ON_OVER);
    };

}
