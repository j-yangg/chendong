package org.cd.designpatterns.decorator;

/**
 * @classname: Display
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-16 22:31
 */
public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
