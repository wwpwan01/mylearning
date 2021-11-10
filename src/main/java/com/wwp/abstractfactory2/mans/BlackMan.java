package com.wwp.abstractfactory2.mans;

import com.wwp.abstractfactory2.BlackHuman;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName BlackMan.java
 * @Description 黑男
 * @createTime 2021年11月10日 15:17:00
 */
public class BlackMan extends BlackHuman {
    @Override
    public void sex(){
        System.out.println("黑男");
    }
}
