package org.cd.designpatterns.strategy;

/**
 * @classname: Hand
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-18 21:11
 */
public class Hand {
    public static final int SHI_TOU = 0; //表示石头的值
    public static final int JIAN_DAO = 1; //表示石头的值
    public static final int BU = 2; //表示石头的值
    public static final Hand[] hand = {
            new Hand(SHI_TOU), new Hand(JIAN_DAO), new Hand(BU)
    };
    public static final String[] name = {
            "石头", "剪刀", "布"
    };
    private int handValue;
    private Hand (int handValue) {
        this.handValue = handValue;
    }
    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == -1;
    }
    public int fight(Hand hand) {
        if (this == hand) {
            return 0;
        }else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        }else {
            return -1;
        }
    }
    public String toString() {
        return name[this.handValue];
    }
    public static Hand getHand(int handValue) {
        return hand[handValue];
    }
    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }
}
