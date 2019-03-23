package com.edu.pattern;

public class Spring {
    /**
     * IOC  AOP  DI
     *
     * AOP：面向切面编程，动态代理
     * 动态代理只是AOP的一种技术实现手段，AOP只是一种编程思想
     *
     * 切面：Aspect   解耦
     * 面的组成：有规律的
     * 由某几个本来不相干的东西，组到一块形成新的产品
     * 找出多个bean中有一定规律的代码，开发时拆开，运行时再合并
     * 面向切面编程就是面向规则编程。日志监控、事务开启关闭、权限控制
     * Execution:切面表达式：com.edu.*.service.*
     * 事务代理：事务加载在Service层的增删改中
     *
     *
     * OOP：封装、继承、多态（一切皆对象）
     * OOP;用代码去描述这个世界（解释生活）
     *  关注技术细节：面向过程
     *  关心的是事物之间的联系：面向对象
     *
     *  BOP：问题：new个不停，配置Hibernate的对象关系
     *  配置ORM的时候：1对多的时候
     *  BOP 就是当成是Bean与Bean之间的关系，不希望每次人为地重复管理
     *      由程序实现自动管理
     *      Spring 开始就是从Bean管理的
     *      不需要new Bean():只需要你声明，只需要关注bean与bean之间的联系
     *
     *  IOC：控制反转  ：创建对象的控制权反转，反转给Spring（BeanFactory）
     *      有了Spring以后，所有的Bean都是Spring来new 所以才叫控制反转
     *      new 出来的对象需要统一管理起来，所以才有了IOC容器（Map）
     *      问题：不知道new的对象在哪里
     *
     *  DI技术：依赖注入（依赖查找DL）Spring不仅能创建对象，能够保存对象与对象之间的关联关系，
     *          解决对象动态赋值的问题。
     *          自动赋值：三种赋值方法：构造方法，set赋值，直接赋值（反射）
     *          @Autowried
     *          private Object object;  直接赋值
     *
     *          @Resource("beanName")
     *          public void setXXX(){}   set方法赋值
     *
     *          构造方法：以前通过XML 配置数值
     *
     *
     *
     *  Spring 的加载步骤：定位、载入、注册：再确定要不要初始化Spring
     *
     *
     *
     *
     *
     *
     */
}
