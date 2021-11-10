package com.wwp.factory2;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 工厂方法模式
 * @createTime 2021年11月10日 14:37:00
 */
public class Test {

    public static void main(String[] args) {

        HumanFactory humanFactory = new HumanFactory();
        Human human = humanFactory.createHuman(BlackHuman.class);
        human.laugh();
        human.cry();
        human.talk();
        human = humanFactory.createHuman(WhiteHuman.class);
        human.laugh();
        human.cry();
        human.talk();
        human = humanFactory.createHuman(YellowHuman.class);
        human.laugh();
        human.cry();
        human.talk();
    }
}
