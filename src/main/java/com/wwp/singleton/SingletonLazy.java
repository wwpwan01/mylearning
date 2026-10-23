package com.wwp.singleton;

/**
 * 懒汉式 双重校验
 * 支持延时加载，会创建两个地址不一样的对象，线程不安全，需要加synchronized保证多线程模式下使线程安全
 */
public class SingletonLazy {

    private static SingletonLazy singletonLazy = null;

    private SingletonLazy(){
//        System.out.println("========");
    }

    public static SingletonLazy getInstance(){
        if(singletonLazy == null){
            synchronized (SingletonLazy.class){
                if(singletonLazy == null){
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }
}
