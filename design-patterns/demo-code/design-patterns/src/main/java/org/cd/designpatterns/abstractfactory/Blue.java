package org.cd.designpatterns.abstractfactory;

/**
 * @classname: Blue
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-24 23:12
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
