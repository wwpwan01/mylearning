package com.wwp.strategy2;

/**
 * 在这里给出对类 Test 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Test {
    /**
     * 业务层调用相同的方法，只需要把想使用的策略传入interface就可以使用策略接口直接调用s
     */
    public static void main(String[] args) {
        Vo vo = new Vo();
        ServcieImpl service = new ServcieImpl();
        // 在这里加入你的代码
        service.crud(vo, new StategyServiceImpl());

        Tvo vo1 = new Tvo();
        ServcieImpl service2 = new ServcieImpl();
        // 在这里加入你的代码

        service.crud(vo1, new StategyServceImpl2());
    }

}