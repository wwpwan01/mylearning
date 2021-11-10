package com.wwp.abstractfactory2.womens;

import com.wwp.abstractfactory2.YellowHuman;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName YellowMan.java
 * @Description 黄女
 * @createTime 2021年11月10日 15:16:00
 */
public class YellowWoman extends YellowHuman {
    @Override
    public void sex() {
        System.out.println("黄女");
    }
}
