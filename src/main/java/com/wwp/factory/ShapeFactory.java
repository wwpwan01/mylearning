package com.wwp.factory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName ShapeFactory.java
 * @Description TODO
 * @createTime 2020-11-10 15:41:00
 */
public class ShapeFactory {
    public Shape getShaper(int i){
        if(i == 0 ){
            return new Circle();
        }else if(i == 1){
            return new Rectangle();
        }else {
            return new Square();
        }
    }
}
