package org.cd.designpatterns.prototype;

/**
 * @classname: Rectangle
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 14:22
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Circle draw...");
    }
}
