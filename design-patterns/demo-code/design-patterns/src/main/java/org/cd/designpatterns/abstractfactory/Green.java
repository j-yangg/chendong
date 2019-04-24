package org.cd.designpatterns.abstractfactory;

/**
 * @classname: Green
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-24 23:12
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
