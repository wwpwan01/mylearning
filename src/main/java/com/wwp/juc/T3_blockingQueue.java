package com.wwp.juc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName T3_blockingQueue.java
 * @Description TODO
 * @createTime 2021-01-31 21:07:00
 */
public class T3_blockingQueue {
    private static final int[] aa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private static final String[] bb = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    static BlockingQueue<String> b1 = new ArrayBlockingQueue<>(1);
    static BlockingQueue<String> b2 = new ArrayBlockingQueue<>(1);

    public static void main(String[] args) {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ss();
        }
    }
    public static void ss(){
        new Thread(() ->{
            for (int i : aa) {
                try {
                    System.out.println(i);
                    b1.put("ok");
                    b2.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() ->{
            for (String i : bb) {
                try {
                    b1.take();
                    System.out.println(i);
                    b2.put("ok");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
