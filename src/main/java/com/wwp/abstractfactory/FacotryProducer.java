package com.wwp.abstractfactory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName FacotryProducer.java
 * @Description 工厂生产者
 * @createTime 2020-11-10 16:53:00
 */
public class FacotryProducer {
    static AbstractFactory getFactory(int i) {
        if(i == 1){
            return new ColorFacotry();
        }else {
            return new ShapeFactory();
        }
    }
}
