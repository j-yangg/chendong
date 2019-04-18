package org.cd.designpatterns.strategy;

/**
 * @classname: Strategy
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-18 21:23
 */
public interface Strategy {
    Hand nextHand();
    void study(boolean vin);
}
