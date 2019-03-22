package com.edu.pattern.observer.simple;

/**
 * 具体观察者
 */
public class User extends Observer {

    private String name;
    private String message;


    public User(Observerable observerable,String name){
        this.name =name;
        this.oberverable =observerable;
        observerable.registerObserver(this);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    private void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }

    //取消
    public void remove(Observerable observerable){
        observerable.removeObserver(this);
    }

}
