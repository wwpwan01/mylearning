package com.wwp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName MovebleTest.java
 * @Description 可以直接改二进制码
 * @createTime 2020-12-17 19:57:00
 */
public class MovebleTest {
    public static void main(String[] args) {
        Persion persion = new Persion("11");
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        DoThing o = (DoThing)Proxy.newProxyInstance(Persion.class.getClassLoader(), new Class[]{DoThing.class}, new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(System.currentTimeMillis());
                Object invoke = method.invoke(persion, args);
                System.out.println(System.currentTimeMillis());
                return invoke;
            }
        });
        o.isRunning();
    }
}
