package org.cd.designpatterns.abstractfactory;

/**
 * @classname: Red
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-24 23:11
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
