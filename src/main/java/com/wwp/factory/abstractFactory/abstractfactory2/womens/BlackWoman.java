package com.wwp.factory.abstractFactory.abstractfactory2.womens;

import com.wwp.factory.abstractFactory.abstractfactory2.BlackHuman;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName BlackMan.java
 * @Description 黑女
 * @createTime 2021年11月10日 15:17:00
 */
public class BlackWoman extends BlackHuman {

    @Override
    public void sex() {
        System.out.println("黑女");
    }
}
