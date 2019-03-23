package com.edu.pattern;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Pattern {

    /**
     * 总结各种设计模式之间的关联
     *
     * 不要生搬硬套，根据业务场景选择
     * 不要把简单的东西搞复杂，设计模式是用来解决复杂问题的
     *
     *  创建型模式
     *  工厂模式：原始社会-—>农耕社会-->小作坊-->工厂-->流水线工厂
     *  Spring:  BeanFactory FactoryBean
     *
     *  单例模式：在整个系统运行阶段，为了提高资源重复利用，
     *  通过技术手段保证在整个系统运行阶段，只有一个实例
     *  场景：配置文件、监控系统、IOC容器、日历
     *  实现手段：懒汉式、饿汉式、注册登记式、反序列化处理
     *  Spring中最常用的是注册登记式。效率性能最高的是内部类
     *
     *  原型模式：复制
     *  Spring中用到原型模式主要是为了配置信息能够被重复使用，而且互不干扰
     *  <bean scope = "prototype">
     *         <list></list>
     *  </bean>
     *  技术手段：实现cloneable 重写clone方法
     *             字节码操作来实现
     *             通过反射机制来实现（Spring中常用）
     *
     *   代理模式：proxy     静态代理实现方式：添加组合  然后调用接口方法
     *   应用场景：中介、黄牛，经纪人
     *   代码场景：字节码增强，动态实现非侵入时编程
     *   完成一件事情：代理模式只参与一部分的功能，被代理人做决定
     *   技术手段：JDK Proxy(接口) ,Cglib （类）、AspectJ、asm
     *   通过代码演示，自己模拟实现了JDK动态代理
     *
     *   策略模式：将一些固定的算法统一起来
     *   应用场景：旅游路线的选择、出行方式的选择
     *   代码场景：支付方式的选择
     *   特点：巧妙地避免了if..else..或者switch 语句
     *
     *   模板方法模式：流程固定、某一个环节有差异
     *   应用场景：JdbcTemplate、工作流
     *   代码场景：模拟Spring JdbcTemplate 的简单实现
     *   spring-orm 、单表操作不需要写一句SQL
     *
     *  委派模式：代理模式的特殊情况：全权代理
     *  应用场景：项目经理、Dispatcher
     *  代码场景：Spring中的 ServletDispatcher、Delegate命名结尾的都是委派模式
     *
     *  适配器模式：兼容、转换
     *  应用场景：一拖三充电头、HDMI转VGA、编码解码
     *  代码场景：登录。为了兼容旧系统的登录功能，在老系统智商进行兼容编程
     *  Spring中 Adapter 结尾的都是适配器模式
     *
     *  装饰器模式：委派+适配器，注重的覆盖，扩展  is-a关系（同源同宗）
     *  应用场景：IO流、数据源包装
     *  代码场景：改造一个旧的系统
     *  在Spring 中 Decorator、Wrapper 结尾的都是装饰器
     *
     *  观察者模式：针对目标对象的一举一动，要得到反馈
     *  应用场景：事件监听，日志监听，邮件通知，短信通知
     *  代码场景：Listener、Monitor 、Observer
     *  Spring Listener (通常会结合动态代理)
     *
     *
     */

    /**
     *  Java 核心思想： 面向接口编程
     *  接口: 只是一种规范，做任何事情以前都要思考后再去动手（定义好规范）
     *  实现类：必须要有接口，开发顺序决定了。
     *
     *  命令模式与策略模式
     *  命令模式：注重命令的个数，分类相当于菜单的
     *  只关心命令的内容是什么 command
     *  策略模式： 用户决定选择，选择以后的东西
     *
     *
     * 当你要用代码去操作代码的时候，你需要要用反射
     *
     *
     * Main方法启动
     * ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext
     *
     * Listener
     *
     * Servlet DispatcherServlet  入口
     *
     */

}
