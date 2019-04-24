package org.cd.designpatterns.abstractfactory;

/**
 * @classname: AbstractFactory
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-24 23:13
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
