package com.wwp.observer;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName AutoObserver.java
 * @Description TODO
 * @createTime 2020-12-20 18:21:00
 */
public class AutoObserver implements Observer {
    public void tail(){
        System.out.println("tail -----------");
    }
    @Override
    public void test(TestEvent testEvent) {
        tail();
        SubServer subServer = testEvent.subServer;
        System.out.println(subServer);
    }
}
