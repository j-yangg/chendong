package org.cd.designpatterns.builder;

/**
 * @classname: TextBuilder
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-26 23:09
 */
public class HTMLBuilder extends Builder {
    private StringBuilder buffer = new StringBuilder();
    @Override
    public void makeTitle(String title) {
        buffer.append("==============Start HTML Document===============\n");
        buffer.append("<h1>");
        buffer.append(title);
        buffer.append("</h1>");
        buffer.append("\n");
    }
    @Override
    public void makeString(String str) {
        buffer.append("<p>");
        buffer.append(str);
        buffer.append("</p>");
        buffer.append("\n");
    }
    @Override
    public void makeItems(String[] items) {
        buffer.append("<ur>");
        buffer.append("\n");
        for (int i = 0; i < items.length ; i++) {
            buffer.append("<li>" + items[i] + "</li>\n");
        }
        buffer.append("</ur>");
        buffer.append("\n");
    }
    @Override
    public void close() {
        buffer.append("==============End HTML Document===============\n");
    }
    public String getResult() {
        return buffer.toString();
    }

}
