package com.edu.pattern.observer.simple;

/**
 * 抽象观察者
 *
 */
public abstract class Observer {

    protected Observerable oberverable;
    public abstract void update(String message);
}
