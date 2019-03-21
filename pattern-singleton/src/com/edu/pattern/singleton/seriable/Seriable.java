package com.edu.pattern.singleton.seriable;

import com.sun.org.apache.xml.internal.serializer.Serializer;

import java.io.Serializable;

/**
 * 序列化与反序列化保证单例：重写readResolve
 */
public class Seriable implements Serializable {

    public final static Seriable INSTANCE = new Seriable();

    private Seriable(){}

    public static Seriable getInstance(){
        return INSTANCE;
    }

    /**
     * 序列化的一个协议
     * @return
     */
    private Object readResolve(){
        return INSTANCE;
    }
}
