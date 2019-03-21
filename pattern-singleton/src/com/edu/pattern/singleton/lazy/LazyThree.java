package com.edu.pattern.singleton.lazy;

/**
 * 双重锁懒加载
 * 优点：线程安全，不至于每次调用getInstance()都会加锁导致降低性能
 *
 * 同时无法防止反射强制破解
 *
 * 问题：java平台内存模型中有一个叫“无序写”（out-of-order writes）的机制。正是这个机制导致了双重检查加锁方法的失效。
 instance = new Singleton(); 这行其实做了两个事情：

 1、调用构造方法，创建了一个实例。

 2、把这个实例赋值给instance这个实例变量。

 假设有两个线程A、B

 1、线程A进入getInstance()方法。

 2、因为此时instance为空，所以线程A进入synchronized块。

 3、线程A执行 instance = new Singleton(); 把实例变量instance设置成了非空。（注意，是在调用构造方法之前。）

 4、线程A退出，线程B进入。

 5、线程B检查instance是否为空，此时不为空（第三步的时候被线程A设置成了非空）。线程B返回instance的引用。（问题出现了，这时instance的引用并不是Singleton的实例，因为没有调用构造方法。） 

 6、线程B退出，线程A进入。

 7、线程A继续调用构造方法，完成instance的初始化，再返回。


 */
public class LazyThree {

    //单例实例变量
    private static LazyThree lazy=null;

    //私有化的构造方法，保证外部的类不能通过构造器来实例化
    private LazyThree(){}

    //获取单例对象实例
    public static LazyThree getInstance(){
        if(lazy==null){
            synchronized (LazyThree.class){
                if(lazy==null){
                    //new 实例化会有一段延迟
                    lazy = new LazyThree();
                }
            }
        }
        System.out.println("我是双重锁定懒汉式单例！");
        return lazy;
    }

}
