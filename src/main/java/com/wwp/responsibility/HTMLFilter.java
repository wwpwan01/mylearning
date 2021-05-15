package com.wwp.responsibility;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName RequestStrChain.java
 * @Description TODO
 * @createTime 2021-01-03 21:20:00
 */
public class HTMLFilter implements Filter {

    public void requeseChain(Response response) {
        response.str = response.str.replace("996","%%");
        System.out.println("HTMLFilter-------"+response.str);
    }

    @Override
    public void requeseChain(Request request, Response response) {
        requeseChain(response);
    }
}
