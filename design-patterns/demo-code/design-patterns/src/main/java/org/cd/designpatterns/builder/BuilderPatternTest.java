package org.cd.designpatterns.builder;

/**
 * @classname: BuilderPatternTest
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-26 23:22
 */
public class BuilderPatternTest {
    public static void main(String[] args) {
        //Text Builder
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);
        System.out.println();
        System.out.println();

        //HTML Builder
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        director = new Director(htmlBuilder);
        director.construct();
        String htmlResult = htmlBuilder.getResult();
        System.out.println(htmlResult);
    }
}
