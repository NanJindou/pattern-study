package com.edu.pattern.singleton.lazy;

/**
 * 懒汉式：默认加载的时候不实例化，在需要用到这个实例的时候才实例化
 * 延时加载
 *
 */
public class LazyOne {

    private LazyOne(){}

    //静态块、公共内存区域
    private static  LazyOne lazyOne = null;

    public static LazyOne getInstance (){
        //调用方法之前，先判断
        //如果没有初始化，将其初始化，并且赋值
        //将该实例缓存好
        if(lazyOne==null)
            //两个线程都会进入这个if里面
            lazyOne = new LazyOne();

        //如果已经初始化，直接返回之间已经保存好的结果
        return lazyOne;
    }
}
