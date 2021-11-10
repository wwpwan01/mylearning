package com.wwp.abstractfactory2.factory;

import com.wwp.abstractfactory2.Human;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName HumanFactory.java
 * @Description 工厂接口
 * @createTime 2021年11月10日 15:51:00
 */
public interface HumanFactory {

    //制造黄色人类
    Human createYellowHuman();

    //制造一个白色人类
    Human createWhiteHuman();

    //制造一个黑色人类
    Human createBlackHuman();

}
