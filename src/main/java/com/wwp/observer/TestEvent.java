package com.wwp.observer;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName TestEvent.java
 * @Description TODO
 * @createTime 2020-12-20 20:09:00
 */
public class TestEvent {
    private int a;
    private long time;
    SubServer subServer;

    public TestEvent(int a, long time, SubServer subServer) {
        this.a = a;
        this.time = time;
        this.subServer = subServer;
    }
}
