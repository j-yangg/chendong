package org.cd.designpatterns.template;

/**
 * @classname: Football
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 22:54
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}

