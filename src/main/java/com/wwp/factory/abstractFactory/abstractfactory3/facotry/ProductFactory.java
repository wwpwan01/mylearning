package com.wwp.factory.abstractFactory.abstractfactory3.facotry;

import com.wwp.factory.abstractFactory.abstractfactory3.brand.Brand;
import com.wwp.factory.abstractFactory.abstractfactory3.produt.Pad;
import com.wwp.factory.abstractFactory.abstractfactory3.produt.Phone;
import com.wwp.factory.abstractFactory.abstractfactory3.produt.Product;

public class ProductFactory extends AbstractFatory {

    @Override
    public Brand getBrand(int i) {
        return null;
    }

    @Override
    public Product getProduct(int i) {
        Product product;
        if(i == 0){
            product =  new Pad();
        }else {
            product =  new Phone();
        }
        return product;
    }
}
