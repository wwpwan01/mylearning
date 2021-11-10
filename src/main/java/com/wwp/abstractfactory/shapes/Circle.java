package com.wwp.abstractfactory.shapes;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Circil.java
 * @Description 圆形
 * @createTime 2020-11-10 15:35:00
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is Circle");
    }
}
