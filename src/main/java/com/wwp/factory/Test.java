package com.wwp.factory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020-11-09 23:10:00
 */
public class Test {
    public static void main(String[] args) {
//        Phone phone = new HuaWei();
//        phone.creatPhone();
//        phone = new SamSun();
//        phone.creatPhone();
//        ShapeFactory factory = new ShapeFactory();
//        factory.getShaper(1).draw();
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
