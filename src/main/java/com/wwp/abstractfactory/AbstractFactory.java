package com.wwp.abstractfactory;

import com.wwp.abstractfactory.colors.Color;
import com.wwp.abstractfactory.shapes.Shape;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName AbstractFactory.java
 * @Description 抽象工厂
 * @createTime 2020-11-10 16:54:00
 */
public interface AbstractFactory{


    /**
     * 获得颜色
     * @param i
     * @return
     */
    Color getColor(int i);

    Shape getShana(int i);
}
