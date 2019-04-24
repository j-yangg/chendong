package org.cd.designpatterns.abstractfactory;

/**
 * @classname: Rectangle
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-24 23:09
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
