package com.wwp.factory2;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName YellowHuman.java
 * @Description 黄种人
 * @createTime 2021年11月10日 14:40:00
 */
public class YellowHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("黄种人===笑");
    }

    @Override
    public void cry() {
        System.out.println("黄种人===哭");
    }

    @Override
    public void talk() {
        System.out.println("黄种人===交谈");
    }
}
