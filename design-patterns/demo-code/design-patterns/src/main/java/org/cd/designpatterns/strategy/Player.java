package org.cd.designpatterns.strategy;

/**
 * @classname: Player
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-18 23:49
 */
public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;
    //赋予姓名和策略
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    //策略决定下一句要出的手势
    public Hand nextHand() {
        return strategy.nextHand();
    }
    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }
    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }
    public void even() {
        gamecount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strategy=" + strategy +
                ", wincount=" + wincount +
                ", losecount=" + losecount +
                ", gamecount=" + gamecount +
                '}';
    }
}
