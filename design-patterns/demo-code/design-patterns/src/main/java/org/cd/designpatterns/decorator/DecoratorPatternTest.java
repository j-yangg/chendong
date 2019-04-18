package org.cd.designpatterns.decorator;

import org.cd.designpatterns.observer.FullBorder;

/**
 * @classname: DecoratorPatternTest
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-16 22:57
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Display coreValue = new StringDisplay("Decorator Pattern");
        Display sideDecorate = new SideBorder(coreValue, '#');
        Display fullDecorate = new FullBorder(coreValue);
        System.out.println("显示原始数据（被装饰对象）:");
        coreValue.show();

        System.out.println("显示两边被加工过的数据:");
        sideDecorate.show();

        System.out.println("显示上下左右都加上边框的数据:");
        fullDecorate.show();

        Display complexDecorate = new SideBorder(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new StringDisplay("Complex Decorator")
                                ), '#'
                        )
                ), '*'
        );
        System.out.println("显示多层嵌套的复杂装饰数据:");
        complexDecorate.show();
    }
}
