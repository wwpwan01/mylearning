package com.wwp.factory.abstractFactory.abstractfactory3;

import com.wwp.factory.abstractFactory.abstractfactory3.brand.Brand;
import com.wwp.factory.abstractFactory.abstractfactory3.facotry.AbstractFatory;
import com.wwp.factory.abstractFactory.abstractfactory3.produt.Product;

public class Test {

    public static void main(String[] args) {
        AbstractFatory abstractFatory = FacotryProducer.getFacory("Brand");

        Brand brand = abstractFatory.getBrand(0);
        brand.getBrand();
        brand = abstractFatory.getBrand(1);
        brand.getBrand();

        abstractFatory = FacotryProducer.getFacory("1");
        Product product = abstractFatory.getProduct(0);
        product.create();
        product = abstractFatory.getProduct(1);
        product.create();
    }
}
