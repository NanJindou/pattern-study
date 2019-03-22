package com.edu.pattern.observer.subject;

import com.edu.pattern.observer.core.Event;

import java.lang.reflect.Method;

public class ObserverTest {
    public static void main(String[] args) {

        try {
            //观察者
            Observer obsever = new Observer();

            Method advice  = Observer.class.getMethod("advice",new Class<?>[]{Event.class});


            Subject subject = new Subject();
            subject.addLisenter(SubjectEventType.ON_ADD,obsever,advice);
            subject.addLisenter(SubjectEventType.ON_RMOVE,obsever,advice);

            subject.add();
            subject.remove();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
