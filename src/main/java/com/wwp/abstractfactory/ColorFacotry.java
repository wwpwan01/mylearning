package com.wwp.abstractfactory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName ColorFacotry.java
 * @Description TODO
 * @createTime 2020-11-10 16:51:00
 */
public class ColorFacotry implements AbstractFactory{

    @Override
    public Color getColor(int i) {
        if(i == 0 ){
//            System.out.println("1 red");
            return new Red();
        }else if(i == 1){
//            System.out.println("2 Green");
            return new Green();
        }else {
//            System.out.println("2 Blue");
            return new Blue();
        }
    }

    @Override
    public Shape getShana(int i) {
        return null;
    }
}
