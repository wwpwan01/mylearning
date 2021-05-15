package com.wwp.visiter;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName CPU.java
 * @Description TODO
 * @createTime 2021-01-02 13:56:00
 */
public class CPU extends ComputerPar {

    @Override
    void accept(Visiter visiter) {
        visiter.visitCpu(this);
    }

    @Override
    double getPrice() {
        return 700;
    }
}
