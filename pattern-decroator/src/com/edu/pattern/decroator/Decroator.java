package com.edu.pattern.decroator;

public class Decroator {

    /**
     * 装饰类
     * 为了某个实现类在不修改原始类的基础上进行动态地覆盖或增加方法
     * 采用装饰器
     * 实现类要保持跟原有类的层级关系 （跟适配器的区别）
     *
     * 装饰器模式实际上是一种非常特殊的适配器模式
     *  IO流包装、数据源包装、简历包装
     *
     *  Decroator   Wrapper 都是装饰器
     *
     */

    /**
     *
     *
     * 装饰器模式                                         适配器模式
     * ----------------------------------------------------------------------------------------
     * 是一种非常特别的适配器                            可以不保留层级关系
     * -----------------------------------------------------------------------------------------
     * 装饰者和被装饰者都要实现同一个接口                适配器和被适配器没有必然的层级联系
     * 主要目的是为了扩展，。依旧保留OOP关系             通常采用代理或者集成形式进行包装
     * -----------------------------------------------------------------------------------------
     * 满足is-a的关系                                    满足has-a
     * -----------------------------------------------------------------------------------------
     * 注重的是覆盖和扩展                                注重的是兼容、转换
     *
     *
     *
     *
     */
}
