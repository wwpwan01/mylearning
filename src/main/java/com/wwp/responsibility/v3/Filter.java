package com.wwp.responsibility.v3;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName RequestChain.java
 * @Description TODO
 * @createTime 2021-01-03 21:12:00
 */
public interface Filter {

    void requeseChain(Request request, Response response, FilterChain filterChain);

}
