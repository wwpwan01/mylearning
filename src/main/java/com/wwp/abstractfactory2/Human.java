package com.wwp.abstractfactory2;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Humain.java
 * @Description 各个种类的人
 * @createTime 2021年11月10日 14:39:00
 */
public interface Human {

    //人是愉快的，会笑的，本来是想用smile表示，想了一下laugh更合适，好长时间没有大笑了；
    void laugh();

    //人类还会哭，代表痛苦
    void cry();

    //人类会说话
    void talk();

    // 性别
    void sex();
}
