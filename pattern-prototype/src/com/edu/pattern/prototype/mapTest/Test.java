package com.edu.pattern.prototype.mapTest;

import com.edu.pattern.prototype.deep.QiTianDaSheng;

import java.io.*;
import java.util.Date;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        String file="D:/tempdata.ser";
//        MonkeyHashMap hashMap = new MonkeyHashMap();
//        hashMap.setName("孙悟空");
//        HashMap<String, String> map =new HashMap <String, String>();
//        map.put("金箍棒", "有");
//        hashMap.setMap(map);
//        fileOutput(hashMap,file);
        MonkeyHashMap hashMap = new MonkeyHashMap();
        hashMap=fileInput(file);
        System.out.println(hashMap.getName());
        System.out.println(hashMap.getMap().get("金箍棒"));
    }

    public static  void fileOutput(MonkeyHashMap  hashMap,String fileName){
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hashMap);
            oos.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static  MonkeyHashMap fileInput(String fileName){
        MonkeyHashMap  hashMap=null;
        try {
            FileInputStream fis  =new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            hashMap = (MonkeyHashMap)ois.readObject();
            ois.close();

        }catch(Exception e){
            e.printStackTrace();
        }
        return hashMap;
    }

}
