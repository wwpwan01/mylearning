package com.wwp.juc;

import java.util.concurrent.Exchanger;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName T4_exchanger.java
 * @Description 有问题会乱序,
 * @createTime 2021-01-31 21:28:00
 */
public class T4_exchanger {
    private static final int[] aa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private static final String[] bb = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    static volatile Exchanger<String> exchanger = new Exchanger<>();

    public static void main(String[] args) {
        new Thread(()->{
            for (int i=0; i< aa.length;i++) {

                System.out.print(aa[i]);
                try {
                    exchanger.exchange("T1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(()->{
            for (int i=0; i< bb.length;i++) {


                System.out.print(bb[i]);
                try {
                    exchanger.exchange("T2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
