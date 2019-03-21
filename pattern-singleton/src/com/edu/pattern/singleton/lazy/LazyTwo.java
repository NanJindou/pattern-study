package com.edu.pattern.singleton.lazy;

/**
 * 懒汉式：默认加载的时候不实例化，在需要用到这个实例的时候才实例化
 * 延时加载
 *加个互斥锁保持线程安全性
 */
public class LazyTwo {

    private LazyTwo(){}

    //静态块、公共内存区域
    private static LazyTwo lazyOne = null;

    //加一个synchronized互斥锁
    public static synchronized LazyTwo getInstance (){

        if(lazyOne==null)
            lazyOne = new LazyTwo();

        return lazyOne;
    }
}
