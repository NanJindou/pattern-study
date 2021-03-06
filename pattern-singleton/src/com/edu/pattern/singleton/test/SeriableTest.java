package com.edu.pattern.singleton.test;

import com.edu.pattern.singleton.seriable.Seriable;

import java.io.*;

public class SeriableTest {

    public static void main(String[] args) {

        Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("Seriable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("Seriable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1=(Seriable)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);




        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
