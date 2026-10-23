package com.wwp.factory.abstractFactory.abstractfactory;

import com.wwp.factory.abstractFactory.abstractfactory.colors.Color;
import com.wwp.factory.abstractFactory.abstractfactory.shapes.Shape;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 抽象工厂
 * @createTime 2020-11-10 16:58:00
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory facotryProducer = FacotryProducer.getFactory(1);
        Color color = facotryProducer.getColor(0);
        color.getColor();
        facotryProducer = FacotryProducer.getFactory(2);
        Shape shana = facotryProducer.getShana(0);
        shana.draw();
    }
}
