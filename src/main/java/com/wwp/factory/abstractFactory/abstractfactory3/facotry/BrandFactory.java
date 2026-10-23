package com.wwp.factory.abstractFactory.abstractfactory3.facotry;

import com.wwp.factory.abstractFactory.abstractfactory3.brand.Brand;
import com.wwp.factory.abstractFactory.abstractfactory3.brand.HW;
import com.wwp.factory.abstractFactory.abstractfactory3.brand.XM;
import com.wwp.factory.abstractFactory.abstractfactory3.produt.Product;

public class BrandFactory extends AbstractFatory{
    @Override
    public Brand getBrand(int i) {
        Brand product;
        if(i == 0){
            product =  new HW();
        }else {
            product =  new XM();
        }
        return product;
    }

    @Override
    public Product getProduct(int i) {
        return null;
    }
}
