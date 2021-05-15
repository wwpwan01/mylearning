package com.wwp.observer;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName HandObserver.java
 * @Description TODO
 * @createTime 2020-12-20 18:20:00
 */
public class HandObserver implements Observer {

    public void feel(){
        System.out.println("fell---------");
    }

    @Override
    public void test(TestEvent testEvent) {
        feel();
    }
}
