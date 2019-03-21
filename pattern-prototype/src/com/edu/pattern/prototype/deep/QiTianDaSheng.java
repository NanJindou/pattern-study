package com.edu.pattern.prototype.deep;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 通过序列与反序列来实现原型模式
 */
public class QiTianDaSheng extends Monkey implements Cloneable{

    public JinGuBang jinGuBang;
    public QiTianDaSheng(){
        //初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepClone();
    }

    public Object deepClone(){
        QiTianDaSheng copy=null;
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream  bis  =new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            copy = (QiTianDaSheng)ois.readObject();
            copy.birthday = new Date();

        }catch (Exception e){
            e.printStackTrace();
        }
        return copy;
    }
}
