package org.cd.designpatterns.abstractfactory;

/**
 * @classname: FactoryProducer
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-24 23:17
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String chose) {
        if(chose.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(chose.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
