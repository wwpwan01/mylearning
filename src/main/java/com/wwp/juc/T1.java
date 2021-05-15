package com.wwp.juc;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName T1.java
 * @Description TODO
 * @createTime 2021-01-31 19:12:00
 */
public class T1 {
    static Thread t1 = null, t2 = null;

    private static final int[] aa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private static final String[] bb = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    static final Object object = new Object();

    public static void ss() {
        t1 = new Thread(() -> {
            synchronized (object) {
                try {
                    for (int i : aa) {
                        System.out.print(i);
                        object.notifyAll();

                        object.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
                object.notifyAll();
            }
        },"t1");
        t2 = new Thread(() -> {
            synchronized (object) {
                try {
                    for (String i : bb) {
                        System.out.println(i);
                        object.notifyAll();

                        object.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
                object.notifyAll();
            }
        },"t2");
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ss();
        }
    }
}
