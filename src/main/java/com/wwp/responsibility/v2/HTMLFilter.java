package com.wwp.responsibility.v2;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName RequestStrChain.java
 * @Description TODO
 * @createTime 2021-01-03 21:20:00
 */
public class HTMLFilter implements Filter {

    public void requeseChain(String str) {
        str = str.replace("996","%%");
        System.out.println("response-------"+str);
    }

    @Override
    public void requeseChain(Request request, Response response, FilterChain filterChain) {
        requeseChain(request.str);

        filterChain.requeseChain(request,response,filterChain);

        requeseChain(response.str);
    }
}
