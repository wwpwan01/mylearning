package com.wwp.responsibility;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName RequestStrChain.java
 * @Description TODO
 * @createTime 2021-01-03 21:20:00
 */
public class SensitiveFilter implements Filter {

    @Override
    public void requeseChain(Request request, Response response) {
        requeseChain(request);
    }

    public void requeseChain(Request request) {
        request.str = request.str.replace("996","%%");
        System.out.println("SensitiveFilter-------"+request.str);
    }
}
