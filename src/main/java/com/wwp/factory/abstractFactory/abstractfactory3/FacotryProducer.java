package com.wwp.factory.abstractFactory.abstractfactory3;

import com.wwp.factory.abstractFactory.abstractfactory3.facotry.AbstractFatory;
import com.wwp.factory.abstractFactory.abstractfactory3.facotry.BrandFactory;
import com.wwp.factory.abstractFactory.abstractfactory3.facotry.ProductFactory;

public class FacotryProducer {
    public static AbstractFatory getFacory(String code){
        AbstractFatory abstractFatory;
        if(code == "Brand"){
            abstractFatory = new BrandFactory();
        } else {
            abstractFatory = new ProductFactory();
        }
        return abstractFatory;
    }
}
