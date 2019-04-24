package org.cd.designpatterns.abstractfactory;

/**
 * @classname: Rectangle
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-24 23:09
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
