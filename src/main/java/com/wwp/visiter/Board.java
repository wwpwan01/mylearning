package com.wwp.visiter;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName Board.java
 * @Description TODO
 * @createTime 2021-01-02 13:57:00
 */
public class Board extends ComputerPar {

    @Override
    void accept(Visiter visiter) {
        visiter.visitBoard(this);
    }

    @Override
    double getPrice() {
        return 800;
    }
}
