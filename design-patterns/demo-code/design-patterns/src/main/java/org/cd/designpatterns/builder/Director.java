package org.cd.designpatterns.builder;

/**
 * @classname: Director
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-26 23:04
 */
public class Director {
    private Builder builder;
    public Director (Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        //编写文档
        builder.makeTitle("美好的一天");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[]{
                "早上好",
                "下午好",
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上好",
                "晚安",
        });
        //完成文档
        builder.close();
    }
}
