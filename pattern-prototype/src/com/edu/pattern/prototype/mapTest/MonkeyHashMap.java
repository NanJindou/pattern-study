package com.edu.pattern.prototype.mapTest;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Hashtable;

//Alt+Insert  可以自动添加代码
public class MonkeyHashMap implements Serializable {

    public  final  static long serialVersionUID =  -7615911107536967446L;
    private HashMap<String,String> map;
    private String name;
    private  String Height;

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public HashMap <String, String> getMap() {
        return map;
    }

    public void setMap(HashMap <String, String> map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
