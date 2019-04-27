package org.cd.designpatterns.builder;

/**
 * @classname: Builder
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-26 23:01
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
