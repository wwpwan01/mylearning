package com.wwp.visiter;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName Computer.java
 * @Description 访问者，适合模块不改动的地方
 * @createTime 2021-01-02 13:52:00
 */
public class Computer {
    private ComputerPar cpu = new CPU();
    private ComputerPar memory = new Memory();
    private ComputerPar board = new Board();

    public void accepte(Visiter visiter) {
        this.cpu.accept(visiter);
        this.memory.accept(visiter);
        this.board.accept(visiter);
    }

    public static void main(String[] args) {
        Student student = new Student();
        new Computer().accepte(student);
        System.out.println(student.totalPrice);
    }
}
