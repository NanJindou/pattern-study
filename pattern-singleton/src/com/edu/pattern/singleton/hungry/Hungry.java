package com.edu.pattern.singleton.hungry;

/**
 *   饿汉式单例：
 *   在类加载的时候就是立即初始化，并且创建单例对象
 *
 *   优点：没有加任何锁，执行效率高
 *   在用户体验上，比懒汉式更好
 *
 *   缺点：类加载的时候就初始化，不管用不用，都是占用空间，浪费内存
 *
 *    绝对线程安全，在线程还未出现就是实例化，不可能存在访问安全问题
 */
public class Hungry {

    private Hungry(){}
    //先静态 后动态
    //先属性 后方法
    //先构建
    //final成员变量表示常量，只能被赋值一次，赋值后值不再改变。
    public static final Hungry   hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }

}
