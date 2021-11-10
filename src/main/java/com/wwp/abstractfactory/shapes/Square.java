package com.wwp.abstractfactory.shapes;

import com.wwp.abstractfactory.shapes.Shape;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Square.java
 * @Description 正方形
 * @createTime 2020-11-10 15:38:00
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("this is SQUARE");
    }
}
