package com.wwp.juc;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName T2_CAS.java
 * @Description TODO
 * @createTime 2021-01-31 21:03:00
 */
public class T2_CAS {

    enum Type{T1,T2};

    static volatile Type r = Type.T1;

    private static final int[] aa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private static final String[] bb = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    public static void main(String[] args) {

        new Thread( () -> {
            for (int i : aa) {
                while (r != Type.T1){}
                System.out.println(i);
                r = Type.T2;
            }
        }).start();


        new Thread( () -> {
            for (String i : bb) {
                while (r != Type.T2){}
                System.out.println(i);
                r = Type.T1;
            }
        }).start();
    }
}
