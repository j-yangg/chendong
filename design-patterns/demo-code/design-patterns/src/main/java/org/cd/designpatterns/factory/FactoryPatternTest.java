package org.cd.designpatterns.factory;

import org.cd.designpatterns.factory.framework.Factory;
import org.cd.designpatterns.factory.framework.Product;
import org.cd.designpatterns.factory.idcard.IDCardFactory;

/**
 * @classname: FactoryPatternTest
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-14 16:16
 */
public class FactoryPatternTest {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product xiaoming = factory.create("小明");
        Product xiaohong = factory.create("小红");
        Product xiaogang = factory.create("小刚");
        xiaoming.use();
        xiaohong.use();
        xiaogang.use();

        System.out.println("Registered Owners: " + ((IDCardFactory) factory).getOwners());
    }
}
