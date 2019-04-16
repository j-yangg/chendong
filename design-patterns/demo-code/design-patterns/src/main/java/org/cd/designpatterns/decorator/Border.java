package org.cd.designpatterns.decorator;

/**
 * @classname: Border
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-16 22:42
 */
public abstract class Border extends Display {
    protected Display display; //表示被装饰物
    protected Border(Display display) { //在生成实例时通过参数指定被装饰物
        this.display = display;
    }
}
