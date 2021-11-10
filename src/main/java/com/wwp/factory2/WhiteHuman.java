package com.wwp.factory2;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName WhiteHuman.java
 * @Description 白人
 * @createTime 2021年11月10日 14:41:00
 */
public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白种人===笑");
    }

    @Override
    public void cry() {
        System.out.println("白种人===哭");
    }

    @Override
    public void talk() {
        System.out.println("白种人===交谈");
    }
}
