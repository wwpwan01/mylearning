package com.wwp.factory;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName Test2.java
 * @Description 字符串实验
 * @createTime 2020-11-14 21:30:00
 */
public class Test2 {

    public static void main(String[] args) {
        String aa = "aa";
        String bb = new String("aa");
        System.out.println(aa.hashCode());
        System.out.println(System.identityHashCode(aa));
        System.out.println(bb.hashCode());
        System.out.println(System.identityHashCode(bb));
        System.out.println(aa == bb);
        System.out.println(aa.equals(bb));
    }
}
