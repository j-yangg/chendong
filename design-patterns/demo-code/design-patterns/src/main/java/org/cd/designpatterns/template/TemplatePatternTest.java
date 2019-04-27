package org.cd.designpatterns.template;

/**
 * @classname: TemplatePatternTest
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 22:55
 */
public class TemplatePatternTest {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
