package com.wwp.factory.abstractFactory.abstractfactory3.produt;

public class Phone implements Product{

    @Override
    public void create() {
        System.out.println("Product is Phone!");
    }
}
