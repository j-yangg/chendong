package org.cd.designpatterns.observer;

/**
 * @classname: ObserverPatternTest
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-15 23:18
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        generator.addObserver(digitObserver);
        generator.addObserver(graphObserver);
        generator.execute();
    }
}
