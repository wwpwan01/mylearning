package com.wwp.juc;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName Test.java
 * @Description TransferQueue
 * @createTime 2021-01-31 18:42:00
 */
public class TransferQueueTest {

    private static final int[] aa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private static final String[] bb = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    private static volatile TransferQueue<String> queue = new LinkedTransferQueue();

    public static void main(String[] args) {

        new Thread(() -> {
            try {
                for (int i : aa) {
                    System.out.println(queue.take());
                    queue.transfer(i+"");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (String i : bb) {

                    queue.transfer(i);
                    System.out.println(queue.take());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(queue.peek());
        }).start();

    }
}
