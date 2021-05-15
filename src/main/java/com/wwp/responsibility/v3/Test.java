package com.wwp.responsibility.v3;


/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2021-01-03 21:35:00
 */
public class Test {
    public static void main(String[] args) {

        Request request = new Request();
        request.str = "今天要996，不996就走人！";

        Response response = new Response();
        response.str = "今天不996，谁996就走人！";
        FilterChain stringResponsibility = new FilterChain();
        stringResponsibility.add(new SensitiveFilter()).add(new HTMLFilter());
        stringResponsibility.requeseChain(request,response);
    }
}
