package com.edu.pattern.prototype.deep;

import java.io.Serializable;

public class JinGuBang implements Serializable {

    private float height = 100;
    private float weight = 100000;

    public void big(){
        this.height *= 2;
        this.weight *= 2;
    }
}
