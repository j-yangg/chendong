package org.cd.designpatterns.factory.idcard;

import org.cd.designpatterns.factory.framework.Product;

/**
 * @classname: IDCard
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-14 16:07
 */
public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("制作" + owner + "的身份证");
        this.owner = owner;
    }
    public void use() {
        System.out.println("使用" + owner + "的身份证");
    }
    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "owner='" + owner + '\'' +
                '}';
    }
}
