package com.wwp.factory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 方法工厂
 * @createTime 2020-11-09 23:10:00
 */
public class Test {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shaper = factory.getShaper(0);
        shaper.draw();
        shaper = factory.getShaper(1);
        shaper.draw();
        shaper = factory.getShaper(2);
        shaper.draw();
    }
}
