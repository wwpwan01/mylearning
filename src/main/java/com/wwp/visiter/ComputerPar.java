package com.wwp.visiter;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName ComputerPar.java
 * @Description TODO
 * @createTime 2021-01-02 13:55:00
 */
public abstract class ComputerPar {
    abstract void accept(Visiter visiter);

    abstract double getPrice();
}
