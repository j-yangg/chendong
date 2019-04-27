package org.cd.designpatterns.prototype;

/**
 * @classname: Rectangle
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 14:22
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }
    @Override
    void draw() {
        System.out.println("Square draw...");
    }
}
