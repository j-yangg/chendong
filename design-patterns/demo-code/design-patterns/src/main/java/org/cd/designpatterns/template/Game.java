package org.cd.designpatterns.template;

/**
 * @classname: Game
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 22:53
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}

