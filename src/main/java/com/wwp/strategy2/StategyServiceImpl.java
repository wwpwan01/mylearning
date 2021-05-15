package com.wwp.strategy2;

/**
 * 在这里给出对类 StategyServiceImpl 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class StategyServiceImpl implements Stategy<Vo,Stategy>
{

    /**
     * 类 StategyServiceImpl 的对象的构造函数
     */
    public StategyServiceImpl()
    {
    }

    /**
     * 一个方法的例子 - 使用你自己的说明替代它
     * 
     * @参数 y，方法的一个样本参数
     * @返回 x，y的和 
     */
    @Override
    public int sampleMethod(Vo vo)
    {
        System.out.println("这是delete");
        // 在这里加入你的代码
        return 1+1;
    }
}
