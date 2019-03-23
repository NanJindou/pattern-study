package com.edu.pattern;

public class PatternType {
    /*
    分类            设计模式
    创建型         工厂方法模式（Factory Method）、抽象工厂（Abstract Factory）、
                   建造者模式（Builder）、原型模式（Prototype）、单例模式（Singleton）
   --------------------------------------------------------------------------------------
   结构型          适配器模式（Adapter）、桥接模式（Bridge）、组合模式（Composite）、
                   装饰器模式（Decorator）、门面模式（Facade）、享元模式（Flyweight）、
                   代理模式（Proxy）
   --------------------------------------------------------------------------------------
   行为型          解释器模式（Interpreter）、模板方法模式（Template Method）、
                  责任链模式（Chain of Responsibility）、命令模式（Command）、
                  迭代模式（Iterator）、调节者模式（Mediator）、备忘录模式（Memento）、
                  观察者模式（Observer）、状态模式（State）、策略模式（Strategy）、
                  访问者模式（Visitor）


      策略模式和工厂模式：
      工厂模式包含工厂方法和抽象工厂，属于创建者模式
      策略模式属于行为型模式

      工厂模式主要目的是封装好创建逻辑，策略模式接受工厂创建好的对象，从而实现不同的行为

      创建：new
      行为：invoke

      策略模式和委派模式：
      1、策略模式使委派模式内部的一种实现模式，策略模式关注的是结果是否互相替换
      2、委派模式更关注分发和调度的过程。
      委派模式：有可能采用if...else...条件分支语句来分发，内部也可以使用策略模式


      模板方法模式和工厂方法模式
      工厂方法只有create()一个步骤，可以认为是只有一个步骤的模板方法
      模板方法内部必然有多种方法，核心是步骤的执行顺序不可变更。
      继承的子类在模板方法中会实现父类的某几个步骤


      模板方法模式和策略模式
      1、模板方法和策略模式都有封装算法
      2、策略模式使使不同算法可以相互替换，且不影响客户端应用层面的使用
      3、模板方法是针对定义一个算法的流程，将一些有细微差异的部分交给子类实现。
      4、模板模式不能改变算法流程，策略模式可以改变算法流程且可替换。
      策略模式通常用来代替if...else...等条件分支语句，注重的里面的实现


      装饰者模式和静态代理模式
      1、装饰者模式关注点在于给对象动态扩展、添加方法，而代理更加注重控制对对象的访问。
      2.代理模式通常会在代理类中创建被代理对象的实例，而装饰者模式通常把被装饰者作为构造参数。
      装饰者可能比被装饰者方法要多（扩展或者覆盖）


      装饰者模式和适配器模式
      1、装饰者模式和适配器模式都属于包装器模式（Wrapper）。
      2、装饰者模式可以实现被装饰者与相同的接口或者继承被装饰者作为它的子类，
      而适配器和被装饰者可以实现不同接口。


      适配器模式和静态代理模式
      1、适配器可以结合代理模式来实现，保存被适配对象的引用，但不是唯一的实现方式。（继承、代理）


      适配器模式和策略模式
      1、在适配业务复杂的情况下，利用策略模式优化动态适配逻辑。

      总结设计模式
      工厂模式：只对结果负责，封装创建过程          BeanFactory
      单例模式：保证独一无二                       Calender（多线程中保持一个）
      原型模式：根据一个对象克隆多个对象            ArrayList.PrototypeBean
      代理模式：找中间人，专人做专事，增强职能      ProxyFactoryBean、JdkDynamicAopProxy、CglibAopProxy
      委派模式：分发工作，对上负责                 DispatcherServlet、BeanDefinitionParseDelegate
      策略模式：用户选择，结果统一                 InstantiationStrategy
      模板模式：流程统一，细节分工定制             JdbcTemplate、HttpServlet
      适配器模式：兼容转换                        AdvisorAdapter、HandlerAdapter
      装饰者模式：用户适配扩展，同宗同源           BufferedReader、InputStream、OutputStream、HttpHeadResponseDecorator
      观察者模式：被观察者通知观察者消息           ContextLoaderListener

     */


}
