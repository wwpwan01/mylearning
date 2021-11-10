package com.wwp.factory2;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName HumanFactory.java
 * @Description 人类工厂
 * @createTime 2021年11月10日 14:37:00
 */
public class HumanFactory {

    Human createHuman(Class<?> whiteHumanClass){
        Human o = null;
        try {
            o = (Human)whiteHumanClass.newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return o;
    };
}
