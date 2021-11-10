package com.wwp.abstractfactory2.mans;

import com.wwp.abstractfactory2.WhiteHuman;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName WhiteMan.java
 * @Description 白男
 * @createTime 2021年11月10日 15:17:00
 */
public class WhiteMan extends WhiteHuman {

    @Override
    public void sex() {
        System.out.println("白男");
    }
}
