package com.wwp.singleton;

/**
 * 饿汉式
 * 不支持延时加载
 */
public class Singleton {


    private static final Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("========");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
