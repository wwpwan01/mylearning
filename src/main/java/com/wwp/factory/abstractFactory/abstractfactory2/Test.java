package com.wwp.factory.abstractFactory.abstractfactory2;

import com.wwp.factory.abstractFactory.abstractfactory2.factory.FemaleHumanFactory;
import com.wwp.factory.abstractFactory.abstractfactory2.factory.HumanFactory;
import com.wwp.factory.abstractFactory.abstractfactory2.factory.MaleHumanFactory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 抽象工厂  sex 方法设计模式中没有
 * @createTime 2021年11月10日 14:37:00
 */
public class Test {

    public static void main(String[] args) {

        HumanFactory humanFactory = new FemaleHumanFactory();
        Human blackHuman = humanFactory.createBlackHuman();
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();
        blackHuman.sex();

        Human whiteHuman = humanFactory.createWhiteHuman();
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();
        whiteHuman.sex();

        blackHuman = humanFactory.createYellowHuman();
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();
        blackHuman.sex();

        humanFactory = new FemaleHumanFactory();
        blackHuman = humanFactory.createBlackHuman();
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();
        blackHuman.sex();

        blackHuman = humanFactory.createWhiteHuman();
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();
        blackHuman.sex();

        blackHuman = humanFactory.createYellowHuman();
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();
        blackHuman.sex();

//        AbstractHumanFactory humanFactory = new AbstractHumanFactory();
//        Human human = humanFactory.createHuman(BlackHuman.class);
//        human.laugh();
//        human.cry();
//        human.talk();
//        human = humanFactory.createHuman(WhiteHuman.class);
//        human.laugh();
//        human.cry();
//        human.talk();
//        human = humanFactory.createHuman(YellowHuman.class);
//        human.laugh();
//        human.cry();
//        human.talk();
    }
}
