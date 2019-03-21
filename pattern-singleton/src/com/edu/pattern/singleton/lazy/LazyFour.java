package com.edu.pattern.singleton.lazy;

/**
 * 懒汉式： 静态内部类
 *  特点：在外部类被调用的时候类才会被加载
 *  内部类一定要在方法调用之前初始化
 *  巧妙地避免了线程安全问题
 *
 *  这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 *  完美的屏蔽了这两个缺点
 *
 */
public class LazyFour {

    //默认使用LazyThree的时候，会先初始化内部类
    //如果没使用的话，内部类不加载的
    //可以利用反射机制来侵入单例

    //private LazyFour(){}

    private static boolean initialized = false;
    private LazyFour(){

        synchronized (LazyFour.class){
            if(initialized == false){
                initialized =!initialized;
            }else{
                throw new RuntimeException("单例已被侵犯");
            }
        }

    }

    //每个关键字都不是多余的
    //static是为了使单例的空间共享
    //final是保证这个方法不被重写、重载
    public static final LazyFour getInstance(){
        //在返回结果之前，一定会先加载内部类
        return LazyHolder.lazy;

    }

    //默认不加载
    private static class LazyHolder{
        private static final LazyFour lazy= new LazyFour();
    }
}
