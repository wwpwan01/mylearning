package com.wwp.proxy;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 静态代理
 * @createTime 2020年10月29日 22:14:00
 */
public class Test {
    public static void main(String[] args) {
        Persion persion = new Persion();
//        persion.setPersionName("lisi");
        new Persion("lisi").isRunning();
        new PersionLog(new Persion("wangwu")).isRunning();
        new PersionLog2(new Persion("wangwu")).isRunning();
//        System.out.println(String.class.getClassLoader());
//        System.out.println(Persion.class.getClassLoader());
//        System.out.println(Persion.class.getClassLoader().getParent());
//        System.out.println(Persion.class.getClassLoader().getParent().getParent());
//        System.out.println(ClassLoader.getSystemClassLoader());
    }
}
