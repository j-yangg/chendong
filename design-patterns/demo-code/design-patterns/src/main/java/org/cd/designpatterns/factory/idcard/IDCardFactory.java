package org.cd.designpatterns.factory.idcard;

import org.cd.designpatterns.factory.framework.Factory;
import org.cd.designpatterns.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @classname: IDCardFactory
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-14 16:12
 */
public class IDCardFactory extends Factory {

    private List<IDCard> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add((IDCard) product);
    }

    public List<IDCard> getOwners() {
        return owners;
    }
}
