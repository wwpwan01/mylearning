package com.wwp.visiter;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName Visiter.java
 * @Description TODO
 * @createTime 2021-01-02 13:58:00
 */
public interface Visiter {
    void visitCpu(CPU cpu);
    void VisitMemory(Memory memory);
    void visitBoard(Board board);
}
