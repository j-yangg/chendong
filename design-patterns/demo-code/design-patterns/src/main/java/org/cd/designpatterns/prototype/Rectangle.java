package org.cd.designpatterns.prototype;

/**
 * @classname: Rectangle
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 14:22
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Rectangle draw...");
    }
}
