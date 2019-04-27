package org.cd.designpatterns.builder;

/**
 * @classname: TextBuilder
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-26 23:09
 */
public class TextBuilder extends Builder {
    private StringBuilder buffer = new StringBuilder();
    @Override
    public void makeTitle(String title) {
        buffer.append("==============Start Text Document===============\n");
        buffer.append("《");
        buffer.append(title);
        buffer.append("》");
        buffer.append("\n");
    }
    @Override
    public void makeString(String str) {
        buffer.append(str);
        buffer.append("\n");
    }
    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length ; i++) {
            buffer.append(" ·" + items[i] + "\n");
        }
        buffer.append("\n");
    }
    @Override
    public void close() {
        buffer.append("==============End Text Document===============\n");
    }
    public String getResult() {
        return buffer.toString();
    }
}
