package com.wwp.abstractfactory;

import com.wwp.abstractfactory.colors.Color;
import com.wwp.abstractfactory.shapes.Shape;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020-11-10 16:58:00
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory facotryProducer = new ColorFacotry();
        Color color = facotryProducer.getColor(2);
        color.getColor();
        facotryProducer = new ShapeFactory();
        Shape shana = facotryProducer.getShana(2);
        shana.draw();
    }
}
