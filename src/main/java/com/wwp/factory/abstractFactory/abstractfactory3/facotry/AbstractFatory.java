package com.wwp.factory.abstractFactory.abstractfactory3.facotry;

import com.wwp.factory.abstractFactory.abstractfactory3.brand.Brand;
import com.wwp.factory.abstractFactory.abstractfactory3.produt.Product;

public abstract class AbstractFatory {
    public abstract Brand getBrand(int i);

    public abstract Product getProduct(int i);
}
