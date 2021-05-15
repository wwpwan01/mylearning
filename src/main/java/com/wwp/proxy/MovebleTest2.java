package com.wwp.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName MovebleTest2.java
 * @Description cglib 没有办法生成final类的代理类  底层用的也是asm
 * @createTime 2020-12-17 20:26:00
 */
public class MovebleTest2 {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Persion.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Persion persion = (Persion) enhancer.create();
//        persion.setPersionName("22");
        persion.isRunning();
    }
}
class TimeMethodInterceptor implements MethodInterceptor{

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long l = System.currentTimeMillis();
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println(System.currentTimeMillis() - l);
        return o1;
    }
}
