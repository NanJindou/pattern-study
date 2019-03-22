package com.edu.pattern.observer.simple;

public class Test {
    /**
     * 1.观察者可以同时订阅多个被观察者。
     * 2.被观察者可以同时被多个观察者订阅。
     * 3.被观察者发生改变时会影响到所有的观察者。重点
     * @param args
     */
    public static void main(String[] args) {
        WeChatServer server = new WeChatServer();

        Observer userZhang = new User(server,"ZhangSan");
        Observer userLi = new User(server,"LiSi");
        Observer userWang = new User(server,"WangWu");

        //微信服务推送消息
        //微信是被观察者
        server.setInfomation("PHP是世界上最好用的语言！");
        ((User) userWang).remove(server);
        server.setInfomation("Java是最好的语言");


    }
}
