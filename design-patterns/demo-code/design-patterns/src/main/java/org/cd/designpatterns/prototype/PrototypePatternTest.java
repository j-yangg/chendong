package org.cd.designpatterns.prototype;

/**
 * @classname: PrototypePatternTest
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 14:42
 */
public class PrototypePatternTest {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape cloneShape1 = ShapeCache.getShape("1");
        System.out.println("Shape: " + cloneShape1);
        cloneShape1.draw();

        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + cloneShape2);
        cloneShape2.draw();

        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println("Shape: " + cloneShape3);
        cloneShape3.draw();
    }
}
