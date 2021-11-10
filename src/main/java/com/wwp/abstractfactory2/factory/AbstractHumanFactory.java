package com.wwp.abstractfactory2.factory;

import com.wwp.abstractfactory2.Human;
import com.wwp.abstractfactory2.enums.HumanEnum;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName HumanFactory.java
 * @Description 人类工厂
 * @createTime 2021年11月10日 14:37:00
 */
public abstract class AbstractHumanFactory implements HumanFactory {

    protected Human createHuman(HumanEnum humanEnum){
        Human o = null;
        try {
            o = (Human)Class.forName(humanEnum.getValue()).newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return o;
    }

}
