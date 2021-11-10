package com.wwp.abstractfactory2.factory;

import com.wwp.abstractfactory2.Human;
import com.wwp.abstractfactory2.enums.HumanEnum;

/**
 * @title 女工厂
 * @description
 * @author wwp
 * @updateTime
 * @throws
 */
public class FemaleHumanFactory extends AbstractHumanFactory {
    //创建一个女性黑种人
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

    //创建一个女性白种人
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    //创建一个女性黄种人
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }
}