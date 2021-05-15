package com.wwp.jvmpack;

import static java.lang.System.*;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Disorder.java
 * @Description TODO
 * @createTime 2020-11-03 23:02:00
 */
public class Disorder {
    private static int a, b, c, d;

    public static void main(String[] args) throws InterruptedException {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        int i= 0;
        for ( ;;) {
            i++;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    a = 1;
                    c = b;
                }
            });

            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    b = 1;
                    d = a;
                }
            });
            thread.start();
            thread1.start();
            thread.join();
            thread1.join();
            if(c == 0 && d == 0){
                out.println(i);
                break;
            }else {
                out.println(" count : " + i);
            }
        }

    }
}
