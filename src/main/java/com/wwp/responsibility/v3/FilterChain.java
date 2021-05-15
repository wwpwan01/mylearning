package com.wwp.responsibility.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wwp
 * @version 1.0.0
 * @program my_learning
 * @ClassName StringResponsibility.java
 * @Description TODO
 * @createTime 2021-01-03 21:26:00
 */
public class FilterChain {

    static List<Filter> requestChainList = new ArrayList<>();

    int i = 0 ;
    public FilterChain add(Filter requestChain){
        requestChainList.add(requestChain);
        return this;
    }
    public void requeseChain(Request request, Response response) {
        if(i == requestChainList.size()){
            return;
        }
        Filter f = requestChainList.get(i);
        i++;
        f.requeseChain(request,response,this);
    }

    public FilterChain() {
    }
}
