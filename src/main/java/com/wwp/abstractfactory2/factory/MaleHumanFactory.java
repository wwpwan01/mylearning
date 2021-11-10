package com.wwp.abstractfactory2.factory;

import com.wwp.abstractfactory2.Human;
import com.wwp.abstractfactory2.enums.HumanEnum;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName MaleHumanFactory.java
 * @Description 男工厂
 * @createTime 2021年11月10日 16:02:00
 */
public class MaleHumanFactory extends AbstractHumanFactory {
    //创建一个男性黑种人
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
    //创建一个男性白种人
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }
    //创建一个男性黄种人
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }
}
