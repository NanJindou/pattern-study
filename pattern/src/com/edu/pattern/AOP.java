package com.edu.pattern;

public class AOP {
    /**
     * AOP 应用场景
     *
     * Authentication(权限认证)
     * Auto Caching（自动缓存处理）
     * Error Handling （统一错误处理）
     * Debugging(调试日志输出)
     * Logging(日志记录)
     * Transactions(事务处理)
     *
     *
     * 1、Aspect(切面)：通常是一个类，里面可以定义切入点和通知。
     * 2、JointPoint(连接点)：程序执行过程中明确的点，一般是方法的调用。
     * 3、Advice(通知)：AOP在特定的切入点上执行的增强处理，（增强 关键字 代理模式）
     *    有before、after、afterReturning、afterThrowing、around
     * 4、Pointcut(切入点);就是带有通知的连接点，在程序中主要体现为书写切入点表达式
     *
     *
     * Execution表达式
     * execution（modifiers-pattern? ret-type-pattern declaring-type-pattern?
     *  name-pattern(param-pattern) throws-pattern？）
     *
     *
     *  public void methodName(形参 args) throws Exception{}
     *
     *  modifiers-pattern:方法的操作权限
     *  ret-type-pattern:返回值【必填】
     *  declaring-type-pattern:方法所在的包
     *  name-pattern：方法名【必填】
     *  param-pattern:参数名
     *  throws-pattern：异常
     *
     * 定义规则，找到一个规律，多个类中的多方法形成一个切面
     */

    /*

    SpringAOP.XML中的配置
      <aop:config>
        <!-- 配置切面表达式  相当于@pointcut,用来切面规律一种语言-->
         <aop:pointcut expression="execution(* *..*(..))" id="pointcut"/>

         <!-- 配置切面及通知  相当于@Before,@After,@AfterReturn,@Around,@AfterThrowing-->
        <aop:aspect ref="loggingAspect" order="1">
             <aop:before method="beforeMethod" pointcut-ref="pointcut"/>
             <aop:after method="afterMethod" pointcut-ref="pointcut"/>
             <aop:after-returning method="afterReturningMethod" pointcut-ref="pointcut"  returning="retVal"/>
             <aop:after-throwing method="afterThrowingMethod" pointcut-ref="pointcut" throwing="ex"/>
             <aop:around method="aroundMethod" pointcut-ref="pointcut" />
         </aop:aspect>

         <aop:aspect ref="validateAspect" order="2">
            <aop:before method="beforeMethod" pointcut-ref="pointcut"/>
         </aop:aspect>
     </aop:config>


    SpringBoot配置 :注解方式




     */
}
