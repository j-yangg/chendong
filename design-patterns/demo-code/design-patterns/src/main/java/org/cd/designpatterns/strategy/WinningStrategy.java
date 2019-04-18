package org.cd.designpatterns.strategy;

import java.util.Random;

/**
 * @classname: WinningStrategy
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-18 21:24
 */
public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand preHand;
    public WinningStrategy(int seed) {
        random = new Random(seed);
    }
    public Hand nextHand() {
        if (!won) {
            preHand = Hand.getHand(random.nextInt(3));
        }
        return preHand;
    }
    public void study(boolean win) {
        won = win;
    }
}
