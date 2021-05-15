package com.wwp.observer;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName Test.java
 * @Description 观察者
 * @createTime 2020-12-20 18:16:00
 */
public class Test {

    public static void main(String[] args) {
        SubServer subServer = new SubServer();
        subServer.add(new HandObserver());
        subServer.add(new AutoObserver());
        subServer.notifyAllObserver();
    }

}
