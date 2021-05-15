package com.wwp.responsibility;

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
public class FilterChain implements Filter {
    static List<Filter> requestChainList = new ArrayList<>();
    public FilterChain add(Filter requestChain){
        requestChainList.add(requestChain);
        return this;
    }
    @Override
    public void requeseChain(Request request, Response response) {
        for (int i = 0; i< requestChainList.size(); i++){
            requestChainList.get(i).requeseChain(request,response);
        }
    }

    public FilterChain() {
    }
}
