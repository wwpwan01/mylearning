package com.wwp.factory.abstractFactory.abstractfactory2.enums;

/**
 * @title 枚举
 * @description
 * @author wwp 
 * @updateTime
 * @throws
 */
public enum HumanEnum {
    //把世界上所有人类型都定义出来
    YelloMaleHuman("com.wwp.factory.abstractFactory.abstractfactory2.mans.YellowMan"),

    YelloFemaleHuman("com.wwp.factory.abstractFactory.abstractfactory2.womens.YellowWoman"),

    WhiteFemaleHuman("com.wwp.factory.abstractFactory.abstractfactory2.womens.WhiteWoman"),

    WhiteMaleHuman("com.wwp.factory.abstractFactory.abstractfactory2.mans.WhiteMan"),

    BlackFemaleHuman("com.wwp.factory.abstractFactory.abstractfactory2.womens.BlackWoman"),

    BlackMaleHuman("com.wwp.factory.abstractFactory.abstractfactory2.mans.BlackMan");

    private String value;

    HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}