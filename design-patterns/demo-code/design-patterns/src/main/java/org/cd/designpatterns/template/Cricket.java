package org.cd.designpatterns.template;

/**
 * @classname: Cricket
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 22:54
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}

