package com.edu.pattern.prototype.simple;

import java.util.ArrayList;

public class Prototype implements Cloneable{

    public String name;

    public ArrayList<String> list =new ArrayList<String>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
