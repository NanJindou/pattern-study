package com.edu.pattern.observer.gperadvice;

public class Test {
    public static void main(String[] args) {

        Question question = new Question("小明","装饰者模式和适配器模式有什么区别");

        Gper gper = Gper.getInstance();
        Teacher teacher = new Teacher("mic");
        Teacher teacher1 = new Teacher("tom");
        gper.addObserver(teacher);
        gper.addObserver(teacher);
        gper.publishQuestion(question);

    }
}
