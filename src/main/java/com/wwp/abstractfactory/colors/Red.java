package com.wwp.abstractfactory.colors;

import com.wwp.abstractfactory.colors.Color;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Red.java
 * @Description 红
 * @createTime 2020-11-10 16:52:00
 */
public class Red implements Color {
    @Override
    public void getColor() {
        System.out.println("use red");
    }
}
