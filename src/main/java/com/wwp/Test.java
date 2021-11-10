package com.wwp;


import java.util.HashMap;
import java.util.Map;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020-12-16 22:05:00
 */
public class Test {

    public static void main(String[] args) {
//        DoubleNode node = new DoubleNode(1);
//        DoubleNode node1 = new DoubleNode(2);
//        DoubleNode node2 = new DoubleNode(3);
//        node.setNext(node1);
//        node1.setNext(node2);
//        System.out.println(node);
//        node.reverseLinkeList(node);
        HashMap m = new HashMap<>();
        m.put(1,"1");
    }


}
class DoubleNode{
    public int value;
    public DoubleNode last;
    public DoubleNode next;

    public DoubleNode(int date){
        this.value = date;
    }

    public DoubleNode getLast() {
        return last;
    }

    public void setLast(DoubleNode last) {
        this.last = last;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "value=" + value +
                ", last=" + last +
                ", next=" + next +
                '}';
    }

    public DoubleNode reverseLinkeList(DoubleNode node){
        DoubleNode pre = null;
        DoubleNode next = null;
        while (node!=null){
            next = node.next;
            System.out.println("next--" + next);
            node.next = pre;
            System.out.println("node--"+ node);
            pre = node;
            System.out.println("pre--" + pre);
            node = next;
            System.out.println("node2--" + node);
        }
        return pre;
    }
}
