package com.wwp.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName Condition.java
 * @Description TODO
 * @createTime 2021-01-31 19:49:00
 */
public class Conditions {
    private static final int[] aa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private static final String[] bb = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        Condition condition2 = lock.newCondition();

        new Thread(() -> {
            try {
                lock.lock();

                for (int i : aa) {
                    System.out.println(i);
                    // 唤醒
                    condition2.signal();
                    condition.await();

                }
                condition2.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }).start();
        new Thread(() -> {
            try {
                lock.lock();

                for (String i : bb) {
                    System.out.println(i);
                    // 唤醒
                    condition.signal();
                    condition2.await();

                }
                condition.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }).start();
    }

}
