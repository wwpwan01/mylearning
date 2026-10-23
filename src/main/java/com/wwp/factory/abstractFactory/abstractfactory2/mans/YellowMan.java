package com.wwp.factory.abstractFactory.abstractfactory2.mans;

import com.wwp.factory.abstractFactory.abstractfactory2.YellowHuman;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName YellowMan.java
 * @Description 黄男
 * @createTime 2021年11月10日 15:16:00
 */
public class YellowMan extends YellowHuman {

    @Override
    public void sex() {
        System.out.println("黄男");
    }
}
