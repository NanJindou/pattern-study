package com.edu.pattern.prototype.simple;

public class CloneTest {

    public static void main(String[] args) {
        Prototype p = new Prototype();
        p.name="Tom";
        p.list.add("1");

        try {
            Object obj = (Prototype)p.clone();
            System.out.println(p.list);
            System.out.println(((Prototype) obj).list);
            p.list.add("2");
            System.out.println(((Prototype) obj).list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
