package com.wwp.abstractfactory;

import com.wwp.abstractfactory.colors.Red;
import com.wwp.abstractfactory.colors.Blue;
import com.wwp.abstractfactory.colors.Color;
import com.wwp.abstractfactory.colors.Green;
import com.wwp.abstractfactory.shapes.Shape;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName ColorFacotry.java
 * @Description TODO
 * @createTime 2020-11-10 16:51:00
 */
public class ColorFacotry implements AbstractFactory {

    @Override
    public Color getColor(int i) {
        if(i == 0 ){
            return new Red();
        }else if(i == 1){
            return new Green();
        }else {
            return new Blue();
        }
    }

    @Override
    public Shape getShana(int i) {
        return null;
    }
}
