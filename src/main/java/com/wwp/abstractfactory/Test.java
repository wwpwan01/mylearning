package com.wwp.abstractfactory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020-11-10 16:58:00
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory facotryProducer = FacotryProducer.getFactory(1);
        Color color = facotryProducer.getColor(2);
        color.getColor();
        AbstractFactory facotryProducer2 = FacotryProducer.getFactory(2);
        Shape shana = facotryProducer2.getShana(2);
        shana.draw();
    }
}
