package com.wwp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName SubServer.java
 * @Description TODO
 * @createTime 2020-12-20 18:17:00
 */
public class SubServer {

    List<Observer> observerList = new ArrayList<>();

    /*{
        observerList.add(new HandObserver());
        observerList.add(new AutoObserver());
    }*/

    public void add(Observer observer){
        this.observerList.add(observer);
    }

    boolean goOn = false;

    public void notifyAllObserver(){
        TestEvent testEvent1 = new TestEvent(1,System.currentTimeMillis(), this);
        for (Observer observer : observerList){
            observer.test(testEvent1);
        }
    }

}
