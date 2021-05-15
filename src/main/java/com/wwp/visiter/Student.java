package com.wwp.visiter;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName Student.java
 * @Description TODO
 * @createTime 2021-01-02 14:04:00
 */
public class Student implements Visiter {

    double totalPrice = 0.0D;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.3;
    }

    @Override
    public void VisitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.6;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.9;
    }
}
