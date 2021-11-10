package com.wwp.abstractfactory.shapes;

import com.wwp.abstractfactory.shapes.Shape;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Rectangle.java
 * @Description 长方形
 * @createTime 2020-11-10 15:37:00
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is RECTANGLE");
    }
}
